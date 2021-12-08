package top.zw.ioc.v2;

/**
 * @author zhangwang
 * @version 1.0.0
 * @ClassName BeansException
 * @createTime 2021年12月08日 21:56:07
 **/
public class BeansException extends Exception {

    public BeansException(String message) {
        super(message);
    }

    public BeansException(String message, Throwable cause) {
        super(message, cause);
    }
}
