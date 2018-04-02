package cn.clt.core.exception;

/**
 * @Description 业务异常
 * @Aouthor CLT
 * @Date 2018/04/02 18:40
 */
public class BussinessException extends RuntimeException {

    public BussinessException() {
        super();
    }

    public BussinessException(String message) {
        super(message);
    }

    public BussinessException(String message, Throwable cause) {
        super(message, cause);
    }

    public BussinessException(Throwable cause) {
        super(cause);
    }

    protected BussinessException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
