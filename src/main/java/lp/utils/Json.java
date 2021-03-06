package lp.utils;

/**
 * 同意返回JSON类
 * @author 刘攀
 *
 */
public class Json {

    public static final String SUCCESS = "200";

    public static final String FAILURE = "412";

    public static final String ERROR = "500";

    /**
     * 结果
     */
    private String ReturnCode;

    /**
     * 消息
     */
    private String message;

    /**
     * 数据
     */
    private Object data;

    
    public Json() {
        super();
    }

    /**
     * @param result
     * @param message
     */
    
    public Json(String ReturnCode, String message) {
        super();
        this.ReturnCode = ReturnCode;
        this.message = message;
    }

    /**
     * message的GET方法
     * @return String message.
     */
    public String getMessage() {
        return message;
    }

    /**
     * message的SET方法
     * @param message The message to set.
     */
    public void setMessage(String message) {
        this.message = message;
    }

    /**
     * result的GET方法
     * @return String result.
     */
    public String getReturnCode() {
        return ReturnCode;
    }

    /**
     * result的SET方法
     * @param result The result to set.
     */
    public void setReturnCode(String ReturnCode) {
        this.ReturnCode = ReturnCode;
    }

    /**
     * data的GET方法
     * @return Object data.
     */
    public Object getData() {
        return data;
    }

    /**
     * data的SET方法
     * @param data The data to set.
     */
    public void setData(Object data) {
        this.data = data;
    }
   
}
