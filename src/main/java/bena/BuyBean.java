package bena;

public class BuyBean {


    /**
     * code : 0
     * message : 您还有未完成的订单
     * processed : 14.079632
     * result : null
     */

    private int code;
    private String message;
    private double processed;
    private Object result;

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

    public Object getResult() {
        return result;
    }

    public void setResult(Object result) {
        this.result = result;
    }

    @Override
    public String toString() {
        return "BuyBean{" +
                "code=" + code +
                ", message='" + message + '\'' +
                ", processed=" + processed +
                ", result=" + result +
                '}';
    }
}
