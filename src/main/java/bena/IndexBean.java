package bena;

import java.util.List;

public class IndexBean
{
    //http://agrvip.com/index

    /**
     * code : 1
     * message : 操作成功
     * processed : 10.182706
     * result : {"category":[{"begin0":true,"begin1":true,"cover":"/static/uploads/goods/202010/28/admin_1_86347914bef9330a3c69d2df08eca234.jpg|/static/uploads/goods/202010/28/admin_1_e7007af6b2a26705529428dedf2d29e8.jpg","date":"","end":"12:00","id":16,"little":false,"name":"玉石A区","start":"10:00","yuyue0":false,"yuyue1":false},
     * {"begin0":false,"begin1":false,"cover":"/static/uploads/goods/202010/28/admin_1_a10b5e0db4839dd36174870faf0097c4.jpg|/static/uploads/goods/202010/28/admin_1_fab9bbadbec2bb1f7877614e9a2e2c5b.jpg","date":"2020-11-02","end":"22:00","id":19,"little":false,"name":"玉石B区","start":"20:00","yuyue0":false,"yuyue1":false},{"begin0":false,"begin1":false,"cover":"|","date":"2020-11-02","end":"12:00","id":30,"little":false,"name":"财神护体","start":"12:00","yuyue0":false,"yuyue1":false},{"begin0":false,"begin1":false,"cover":"|","date":"2020-11-02","end":"12:00","id":31,"little":false,"name":"财神保佑","start":"12:00","yuyue0":false,"yuyue1":true}],"gonggao":{"id":0,"title":""},"lunbo":[{"id":10,"thumb":"/static/uploads/article/202010/30/admin_3_90bef2cef5164c1c54c5ebb8355155e1.jpeg"}]}
     */

    private int code;
    private String message;
    private double processed;
    private ResultBean result;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public double getProcessed() {
        return processed;
    }

    public void setProcessed(double processed) {
        this.processed = processed;
    }

    public ResultBean getResult() {
        return result;
    }

    public void setResult(ResultBean result) {
        this.result = result;
    }

    public static class ResultBean {
        /**
         * category : [{"begin0":true,"begin1":true,"cover":"/static/uploads/goods/202010/28/admin_1_86347914bef9330a3c69d2df08eca234.jpg|/static/uploads/goods/202010/28/admin_1_e7007af6b2a26705529428dedf2d29e8.jpg","date":"","end":"12:00","id":16,"little":false,"name":"玉石A区","start":"10:00","yuyue0":false,"yuyue1":false},
         *             {"begin0":false,"begin1":false,"cover":"/static/uploads/goods/202010/28/admin_1_a10b5e0db4839dd36174870faf0097c4.jpg|/static/uploads/goods/202010/28/admin_1_fab9bbadbec2bb1f7877614e9a2e2c5b.jpg","date":"2020-11-02","end":"22:00","id":19,"little":false,"name":"玉石B区","start":"20:00","yuyue0":false,"yuyue1":false},
         *             {"begin0":false,"begin1":false,"cover":"|","date":"2020-11-02","end":"12:00","id":30,"little":false,"name":"财神护体","start":"12:00","yuyue0":false,"yuyue1":false},
         *             {"begin0":false,"begin1":false,"cover":"|","date":"2020-11-02","end":"12:00","id":31,"little":false,"name":"财神保佑","start":"12:00","yuyue0":false,"yuyue1":true}]
         * gonggao : {"id":0,"title":""}
         * lunbo : [{"id":10,"thumb":"/static/uploads/article/202010/30/admin_3_90bef2cef5164c1c54c5ebb8355155e1.jpeg"}]
         */

        private GonggaoBean gonggao;
        private List<CategoryBean> category;
        private List<LunboBean> lunbo;

        public GonggaoBean getGonggao() {
            return gonggao;
        }

        public void setGonggao(GonggaoBean gonggao) {
            this.gonggao = gonggao;
        }

        public List<CategoryBean> getCategory() {
            return category;
        }

        public void setCategory(List<CategoryBean> category) {
            this.category = category;
        }

        public List<LunboBean> getLunbo() {
            return lunbo;
        }

        public void setLunbo(List<LunboBean> lunbo) {
            this.lunbo = lunbo;
        }

        public static class GonggaoBean {
            /**
             * id : 0
             * title :
             */

            private int id;
            private String title;

            public int getId() {
                return id;
            }

            public void setId(int id) {
                this.id = id;
            }

            public String getTitle() {
                return title;
            }

            public void setTitle(String title) {
                this.title = title;
            }
        }

        public static class CategoryBean {
            /**
             * begin0 : true
             * begin1 : true
             * cover : /static/uploads/goods/202010/28/admin_1_86347914bef9330a3c69d2df08eca234.jpg|/static/uploads/goods/202010/28/admin_1_e7007af6b2a26705529428dedf2d29e8.jpg
             * date :
             * end : 12:00
             * id : 16
             * little : false
             * name : 玉石A区
             * start : 10:00
             * yuyue0 : false
             * yuyue1 : false
             */

            private boolean begin0;
            private boolean begin1;
            private String cover;
            private String date;
            private String end;
            private int id;
            private boolean little;
            private String name;
            private String start;
            private boolean yuyue0;
            private boolean yuyue1;

            public boolean isBegin0() {
                return begin0;
            }

            public void setBegin0(boolean begin0) {
                this.begin0 = begin0;
            }

            public boolean isBegin1() {
                return begin1;
            }

            public void setBegin1(boolean begin1) {
                this.begin1 = begin1;
            }

            public String getCover() {
                return cover;
            }

            public void setCover(String cover) {
                this.cover = cover;
            }

            public String getDate() {
                return date;
            }

            public void setDate(String date) {
                this.date = date;
            }

            public String getEnd() {
                return end;
            }

            public void setEnd(String end) {
                this.end = end;
            }

            public int getId() {
                return id;
            }

            public void setId(int id) {
                this.id = id;
            }

            public boolean isLittle() {
                return little;
            }

            public void setLittle(boolean little) {
                this.little = little;
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public String getStart() {
                return start;
            }

            public void setStart(String start) {
                this.start = start;
            }

            public boolean isYuyue0() {
                return yuyue0;
            }

            public void setYuyue0(boolean yuyue0) {
                this.yuyue0 = yuyue0;
            }

            public boolean isYuyue1() {
                return yuyue1;
            }

            public void setYuyue1(boolean yuyue1) {
                this.yuyue1 = yuyue1;
            }

            @Override
            public String toString() {
                return "CategoryBean{" +
                        "begin0=" + begin0 +
                        ", begin1=" + begin1 +
                        ", cover='" + cover + '\'' +
                        ", date='" + date + '\'' +
                        ", end='" + end + '\'' +
                        ", id=" + id +
                        ", little=" + little +
                        ", name='" + name + '\'' +
                        ", start='" + start + '\'' +
                        ", yuyue0=" + yuyue0 +
                        ", yuyue1=" + yuyue1 +
                        '}';
            }
        }

        public static class LunboBean {
            /**
             * id : 10
             * thumb : /static/uploads/article/202010/30/admin_3_90bef2cef5164c1c54c5ebb8355155e1.jpeg
             */

            private int id;
            private String thumb;

            public int getId() {
                return id;
            }

            public void setId(int id) {
                this.id = id;
            }

            public String getThumb() {
                return thumb;
            }

            public void setThumb(String thumb) {
                this.thumb = thumb;
            }
        }
    }
}
