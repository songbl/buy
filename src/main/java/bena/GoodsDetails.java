package bena;

public class GoodsDetails
{
    /**
     * code : 1
     * message : 操作成功
     * processed : 5.29998
     * result : {"begin":false,"cover":"/static/uploads/goods/202010/28/admin_1_ed93d9ddf6f7100871e41e59c1f33e49.jpg",
     * "id":425,
     * "my":false,
     * "name":"玉石B区",
     * "no":"4636",
     * "price":"494.00",
     * "specifications":"3535",
     * "status":0}
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
         * begin : false
         * cover : /static/uploads/goods/202010/28/admin_1_ed93d9ddf6f7100871e41e59c1f33e49.jpg
         * id : 425
         * my : false
         * name : 玉石B区
         * no : 4636
         * price : 494.00
         * specifications : 3535
         * status : 0
         */

        private boolean begin;
        private String cover;
        private int id;
        private boolean my;
        private String name;
        private String no;
        private String price;
        private String specifications;
        private int status;

        public boolean isBegin() {
            return begin;
        }

        public void setBegin(boolean begin) {
            this.begin = begin;
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

        public boolean isMy() {
            return my;
        }

        public void setMy(boolean my) {
            this.my = my;
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

        public String getSpecifications() {
            return specifications;
        }

        public void setSpecifications(String specifications) {
            this.specifications = specifications;
        }

        public int getStatus() {
            return status;
        }

        public void setStatus(int status) {
            this.status = status;
        }
    }

    // http://agrvip.com/shop/goodsDetails?id=521



}
