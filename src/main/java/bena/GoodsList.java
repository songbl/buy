package bena;

import java.util.List;

public class GoodsList {
    /**
     * code : 1
     * message : 操作成功
     * processed : 11.079304
     * result : {"hasMore":true,"list":[{"begin":true,"click":false,"cover":"/static/uploads/goods/202010/28/admin_1_b2d47fc38661a3165f51793e8199937f.jpg","id":609,"name":"玉石A区","no":"344432","price":"1000~5000","status":2},{"begin":true,"click":false,"cover":"/static/uploads/goods/202010/28/admin_1_fe03b7f89f72c1d17b4a54bfdad18171.jpg","id":613,"name":"玉石A区","no":"342452","price":"1000~5000","status":2},{"begin":true,"click":false,"cover":"/static/uploads/goods/202010/28/admin_1_0a8c18ed2a1bf31590d178068fe7a734.jpg","id":659,"name":"玉石A区","no":"3424522","price":"1000~5000","status":2},{"begin":true,"click":false,"cover":"/static/uploads/goods/202010/28/admin_1_0a8c18ed2a1bf31590d178068fe7a734.jpg","id":575,"name":"玉石A区","no":"3424522","price":"1000~5000","status":3},{"begin":true,"click":false,"cover":"/static/uploads/goods/202010/28/admin_1_fe03b7f89f72c1d17b4a54bfdad18171.jpg","id":585,"name":"玉石A区","no":"342452","price":"1000~5000","status":3},{"begin":true,"click":false,"cover":"/static/uploads/goods/202010/28/admin_1_fe03b7f89f72c1d17b4a54bfdad18171.jpg","id":588,"name":"玉石A区","no":"342452","price":"1000~5000","status":3},{"begin":true,"click":false,"cover":"/static/uploads/goods/202010/28/admin_1_2ede70a4d7f9cc235439402c8e56d5c5.jpg","id":605,"name":"玉石A区","no":"23432","price":"1000~5000","status":3},{"begin":true,"click":false,"cover":"/static/uploads/goods/202010/28/admin_1_0a8c18ed2a1bf31590d178068fe7a734.jpg","id":608,"name":"玉石A区","no":"3424522","price":"1000~5000","status":3},{"begin":true,"click":false,"cover":"/static/uploads/goods/202010/28/admin_1_b2d47fc38661a3165f51793e8199937f.jpg","id":610,"name":"玉石A区","no":"344432","price":"1000~5000","status":3},{"begin":true,"click":false,"cover":"/static/uploads/goods/202010/28/admin_1_fe03b7f89f72c1d17b4a54bfdad18171.jpg","id":670,"name":"玉石A区","no":"342452","price":"1000~5000","status":3}]}
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
         * hasMore : true
         * list : [{"begin":true,"click":false,"cover":"/static/uploads/goods/202010/28/admin_1_b2d47fc38661a3165f51793e8199937f.jpg","id":609,"name":"玉石A区","no":"344432","price":"1000~5000","status":2},
         * {"begin":true,"click":false,"cover":"/static/uploads/goods/202010/28/admin_1_fe03b7f89f72c1d17b4a54bfdad18171.jpg","id":613,"name":"玉石A区","no":"342452","price":"1000~5000","status":2},
         * {"begin":true,"click":false,"cover":"/static/uploads/goods/202010/28/admin_1_0a8c18ed2a1bf31590d178068fe7a734.jpg","id":659,"name":"玉石A区","no":"3424522","price":"1000~5000","status":2},
         * {"begin":true,"click":false,"cover":"/static/uploads/goods/202010/28/admin_1_0a8c18ed2a1bf31590d178068fe7a734.jpg","id":575,"name":"玉石A区","no":"3424522","price":"1000~5000","status":3},
         * {"begin":true,"click":false,"cover":"/static/uploads/goods/202010/28/admin_1_fe03b7f89f72c1d17b4a54bfdad18171.jpg","id":585,"name":"玉石A区","no":"342452","price":"1000~5000","status":3},
         * {"begin":true,"click":false,"cover":"/static/uploads/goods/202010/28/admin_1_fe03b7f89f72c1d17b4a54bfdad18171.jpg","id":588,"name":"玉石A区","no":"342452","price":"1000~5000","status":3},
         * {"begin":true,"click":false,"cover":"/static/uploads/goods/202010/28/admin_1_2ede70a4d7f9cc235439402c8e56d5c5.jpg","id":605,"name":"玉石A区","no":"23432","price":"1000~5000","status":3}
         * {"begin":true,"click":false,"cover":"/static/uploads/goods/202010/28/admin_1_0a8c18ed2a1bf31590d178068fe7a734.jpg","id":608,"name":"玉石A区","no":"3424522","price":"1000~5000","status":3},
         * {"begin":true,"click":false,"cover":"/static/uploads/goods/202010/28/admin_1_b2d47fc38661a3165f51793e8199937f.jpg","id":610,"name":"玉石A区","no":"344432","price":"1000~5000","status":3},
         * {"begin":true,"click":false,"cover":"/static/uploads/goods/202010/28/admin_1_fe03b7f89f72c1d17b4a54bfdad18171.jpg","id":670,"name":"玉石A区","no":"342452","price":"1000~5000","status":3}]
         */

        private boolean hasMore;
        private List<ListBean> list;

        public boolean isHasMore() {
            return hasMore;
        }

        public void setHasMore(boolean hasMore) {
            this.hasMore = hasMore;
        }

        public List<ListBean> getList() {
            return list;
        }

        public void setList(List<ListBean> list) {
            this.list = list;
        }

        public static class ListBean {
            /**
             * begin : true
             * click : false
             * cover : /static/uploads/goods/202010/28/admin_1_b2d47fc38661a3165f51793e8199937f.jpg
             * id : 609
             * name : 玉石A区
             * no : 344432
             * price : 1000~5000
             * status : 2
             */

            private boolean begin;
            private boolean click;
            private String cover;
            private int id;
            private String name;
            private String no;
            private String price;
            private int status;

            public boolean isBegin() {
                return begin;
            }

            public void setBegin(boolean begin) {
                this.begin = begin;
            }

            public boolean isClick() {
                return click;
            }

            public void setClick(boolean click) {
                this.click = click;
            }

            public String getCover() {
                return cover;
            }

            public void setCover(String cover) {
                this.cover = cover;
            }

            public int getId() {
                return id;
            }

            public void setId(int id) {
                this.id = id;
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public String getNo() {
                return no;
            }

            public void setNo(String no) {
                this.no = no;
            }

            public String getPrice() {
                return price;
            }

            public void setPrice(String price) {
                this.price = price;
            }

            public int getStatus() {
                return status;
            }

            public void setStatus(int status) {
                this.status = status;
            }
        }
    }

    //http://agrvip.com/shop?pageNo=1&category_id=16&area=1
    //http://agrvip.com/shop?pageNo=1&category_id=16&area=1   又来了10页


}
