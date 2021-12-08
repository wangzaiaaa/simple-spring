package top.zw.ioc.v2;

/**
 * @author zhangwang
 * @version 1.0.0
 * @ClassName BeanFactory
 * @createTime 2021年12月08日 21:42:05
 **/
public interface BeanFactory {

    Object getBean(String name) throws BeansException;
}
