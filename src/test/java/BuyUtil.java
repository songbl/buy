import bena.*;
import com.google.gson.Gson;
import net.sf.json.JSONArray;
import net.sf.json.JSONObject;
import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.junit.Test;
import org.springframework.boot.test.context.SpringBootTest;
import utils.MapSortUtil;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.text.SimpleDateFormat;
import java.util.*;


@SpringBootTest
public class BuyUtil {


    private Connection connection;
    private Connection.Response response;
    private Map<String, String> cookies = new HashMap<>();
    private Map<String, Double> sortMap = new HashMap<>();
    public static String UA = "Mozilla/5.0 (Windows NT 10.0; WOW64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/63.0.3239.132 Safari/537.36";

    @Test
    public void buyGoods() {

        login();
    }

    private void login() {

        try {
            connection = Jsoup.connect("http://agrvip.com/login");
            connection.header("Content-Type", "application/x-www-form-urlencoded;charset=utf-8");
            connection.header("User-Agent", UA);
            connection.data("username", "15564690768");
            connection.data("password", "199494");
            connection.cookies(cookies).ignoreContentType(true)
                    .method(Connection.Method.POST).execute();
            response = connection.execute();
            response.body();
            cookies = response.cookies();
            JSONObject jsonObject = JSONObject.fromObject(response.body());
            if (((String) jsonObject.get("message")).equals("登录成功")) {
                System.out.println("---------登录成功------");
//                getGoodsList();
                while (true) {
                    System.out.println("在死循环中");
                    try {
                        Thread.currentThread().sleep(1000);
                        indexList();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
//                indexList();
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    List<Map.Entry<String, Double>> mappingList ;
    private void indexList() {
        try {
            connection = Jsoup.connect("http://agrvip.com/index");
            connection.header("Content-Type", "application/x-www-form-urlencoded;charset=utf-8");
            connection.header("User-Agent", UA);
            connection.cookies(cookies).ignoreContentType(true)
                    .method(Connection.Method.GET).execute();
            response = connection.execute();
            Gson gson = new Gson();
            IndexBean indexBean = gson.fromJson(response.body(), IndexBean.class);
            List<IndexBean.ResultBean.CategoryBean> categoryList = indexBean.getResult().getCategory();
            //其实一共就2个，所有可以写死2，要不还遍历另外哪俩，不合适
            for (int i = 0; i < 2; i++) {
                IndexBean.ResultBean.CategoryBean categoryBean = categoryList.get(i);
                System.out.println("CategoryBean " + categoryBean.toString());
                String categoryId = categoryBean.getId() + "";
//                getGoodsList("http://agrvip.com/shop?pageNo=1"+"&category_id="+categoryId+"&area=1");
                //开始，可以进入
                if (categoryBean.isBegin0() || categoryBean.isBegin1()) {
                    System.out.println("可以进入了...");
                    for (int j = 1; j < 6; j++) {
                        System.out.println("第"+j+"页数据...");
                        getGoodsList("http://agrvip.com/shop?pageNo=" + j + "&category_id=" + categoryId + "&area=1",categoryId);
                    }

                    //循环完了，拿到这几页商品的价格了

                    mappingList = new ArrayList<Map.Entry<String, Double>>(sortMap.entrySet());
                    //4、通过比较器进行比较排序
                    MapSortUtil.sort(mappingList);
                    if (mappingList.size()>0){
                        // 构建指定文件
                        File file = new File("D:\\"+"sort.txt");
                        // 根据文件创建文件的输出流
                        try (OutputStream os = new FileOutputStream(file)) {
                            String str = null;
                            for(Map.Entry<String,Double> mapping:mappingList){
                                str = "排序后的 "+mapping.getKey()+":"+mapping.getValue()+"\n";
                                // 把内容转换成字节数组
                                byte[] data = str.getBytes();
                                // 向文件写入内容
                                os.write(data);
                            }
                        } catch (Exception e) {
                            e.printStackTrace();
                        }

                        for(Map.Entry<String,Double> mapping:mappingList){
                            System.out.println("排序后的 "+mapping.getKey()+"  :  "+mapping.getValue());
                        }

                        System.out.println(mappingList.size());
                        if(mappingList.get(0).getValue()<1200){
                            buy(mappingList.get(0).getKey());
                        }
                        if(mappingList.get(1).getValue()<1200){
                            buy(mappingList.get(1).getKey());
                        }
                        if(mappingList.get(2).getValue()<1200){
                            buy(mappingList.get(2).getKey());
                        }
                        if(mappingList.get(3).getValue()<1200){
                            buy(mappingList.get(3).getKey());
                        }
                        if(mappingList.get(4).getValue()<1200){
                            buy(mappingList.get(4).getKey());
                        }

//                buy(mappingList.get(0).getKey());
//                buy(mappingList.get(1).getKey());
//                buy(mappingList.get(2).getKey());
//                buy(mappingList.get(3).getKey());
//                buy(mappingList.get(4).getKey());
//                buy(mappingList.get(5).getKey());
//                buy(mappingList.get(6).getKey());
//                buy(mappingList.get(7).getKey());
                    }else {
                        System.out.println("排序后 数据是空的....");
                    }

                } else {
                    System.out.println("时间不到，不能进入列表页"+categoryBean.getId());
                }

            }
        } catch (IOException e) {
            e.printStackTrace();
        }


    }


    private void getGoodsList(String url,String categoryId) {

        try {
            connection = Jsoup.connect(url);
            connection.header("Content-Type", "application/x-www-form-urlencoded;charset=utf-8");
            connection.header("User-Agent", UA);
            connection.cookies(cookies).ignoreContentType(true)
                    .method(Connection.Method.GET).execute();

            response = connection.execute();
            Gson gson = new Gson();
            GoodsList goodsList = gson.fromJson(response.body(), GoodsList.class);

            for (int i = 0; i < goodsList.getResult().getList().size(); i++) {
//                String goodsId = ((JSONObject) jsonArray.get(i)).get("id").toString();
                int goodsId = goodsList.getResult().getList().get(i).getId();
                System.out.println("getGoodsList 列表中的商品id----" + goodsId);
                //可以查看商品的详情  http://agrvip.com/shop/goodsDetails?id=521
                //进入商品列表，显示能点了，进去看看价格
                if (goodsList.getResult().getList().get(i).isClick()){
                    goodsDetails("http://agrvip.com/shop/goodsDetails?id=" + goodsId);
                }
//                goodsDetails("http://agrvip.com/shop/goodsDetails?id=" + goodsId);
            }


        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    private void goodsDetails(String url) {
        try {
            //http://agrvip.com/shop/goodsDetails?id=521
            connection = Jsoup.connect(url);
            connection.header("Content-Type", "application/x-www-form-urlencoded;charset=utf-8");
            connection.header("User-Agent", UA);
            connection.cookies(cookies).ignoreContentType(true)
                    .method(Connection.Method.GET).execute();

            response = connection.execute();
            Gson gson = new Gson();
            GoodsDetails goodsDetails = gson.fromJson(response.body(), GoodsDetails.class);

            String price = goodsDetails.getResult().getPrice();
//            System.out.println("商品的价格 " + price);
            double priceDouble = Double.parseDouble(price);
            int id = goodsDetails.getResult().getId();
            System.out.println("商品的id " + id + " 商品的价格" + priceDouble);


            sortMap.put(id + "", priceDouble);


        } catch (IOException e) {
            e.printStackTrace();
        }

    }


    //post
    private void buy(String goodsId) {
        try {
            connection = Jsoup.connect("http://agrvip.com/business/buy");
            connection.header("Content-Type", "application/x-www-form-urlencoded;charset=utf-8");
            connection.header("User-Agent", UA);
            connection.data("id", goodsId);
            connection.cookies(cookies).ignoreContentType(true)
                    .method(Connection.Method.POST).execute();

            response = connection.execute();

            Gson gson = new Gson();
            BuyBean buyBean = gson.fromJson(response.body(), BuyBean.class);
            System.out.println("购买情况 "+buyBean.toString());

            // 构建指定文件
            File file = new File("D:\\hello" + goodsId + ".txt");
            // 根据文件创建文件的输出流
            try (OutputStream os = new FileOutputStream(file)) {
                String str = buyBean.toString();
                // 把内容转换成字节数组
                byte[] data = str.getBytes();
                // 向文件写入内容
                os.write(data);
            } catch (Exception e) {
                e.printStackTrace();
            }

            String format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(System.currentTimeMillis()+"==="+buyBean.toString());

            //todo 看看抢购成功返回的啥
            if (buyBean.getMessage().equals("您还有未完成的订单")) {
                System.out.println("已经抢到，有未支付的订单...");
                return;
            }
            if (buyBean.getMessage().equals("订单不存在")) {
                try {
//                    mappingList.remove(0);
                    //睡眠1s
                    Thread.currentThread().sleep(2000);
                    System.out.println("订单不存在"+format);
                } catch (Exception e) {
                    System.out.println("睡眠挂了....");
                    e.printStackTrace();
                }
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    //预约
    private void appoint(String id) {
        //http://agrvip.com/business/appointment
        try {
            connection = Jsoup.connect("http://agrvip.com/business/appointment");
            connection.header("Content-Type", "application/x-www-form-urlencoded;charset=utf-8");
            connection.header("User-Agent", UA);
            connection.data("id", id);
            connection.data("area", "1");
            connection.cookies(cookies).ignoreContentType(true)
                    .method(Connection.Method.POST).execute();

            response = connection.execute();
            response.body();
            cookies = response.cookies();
            Gson gson = new Gson();
            AppointBean appointBean = gson.fromJson(response.body(), AppointBean.class);

            System.out.println("预约状态 " + appointBean.getMessage());


        } catch (IOException e) {
            e.printStackTrace();
        }

    }


}





