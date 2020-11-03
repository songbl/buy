package utils;

import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.stream.Collectors;

public class MapSortUtil {



    /**
     * 对 map根据 key值排序
     *
     * @param map
     */
    public static void mapSortByKey(Map map) {

        //传进来一个key的比较器对象来构造treemap
        Map<String, String> stu = new TreeMap<>(new MyComparator());
        stu.putAll(map);
        Set<String> keySet = stu.keySet();
        Iterator it = keySet.iterator();
        while (it.hasNext()) {
            String next = (String) it.next();
            System.out.println(next);
        }
    }





    public static void sort(List mappingList) {
        Collections.sort(mappingList, new Comparator<Map.Entry<String, Double>>() {
            public int compare(Map.Entry<String, Double> mapping1, Map.Entry<String, Double> mapping2) {
                return mapping1.getValue().compareTo(mapping2.getValue());
            }
        });

    }
    public static void main(String[] args) {

        System.out.println(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format( System.currentTimeMillis()));
        // 构建指定文件
        File file = new File("D:\\hello"+"3"+".txt");
        // 根据文件创建文件的输出流
        try (OutputStream os = new FileOutputStream(file)) {
            String str = "我是中国人"+"\n"+"我是中国人";
            // 把内容转换成字节数组
            byte[] data = str.getBytes();
            // 向文件写入内容
            os.write(data);
        } catch (Exception e) {
            e.printStackTrace();
        }
        Map<String, Double> stu = new HashMap<>();
        stu.put("666", 1096.00);
        stu.put("667", 888.00);
        stu.put("665",2030.00);
        stu.put("690",480.00);
        stu.put("684",3030.00);
        stu.put("699",2030.00);
////        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
////2、put数据
//
////3、通过ArrayList构造函数把map.entrySet()转换成list
//
        List<Map.Entry<String, Double>> mappingList = new ArrayList<Map.Entry<String, Double>>(stu.entrySet());
////4、通过比较器进行比较排序
//
        sort(mappingList);
//        mapSortByKey(stu);
       System.out.println("第一个数字"+mappingList.get(0).getKey()+"    "+mappingList.get(0).getValue());
        for(Map.Entry<String,Double> mapping:mappingList){
            System.out.println(mapping.getKey()+":"+mapping.getValue());
        }
    }

}

