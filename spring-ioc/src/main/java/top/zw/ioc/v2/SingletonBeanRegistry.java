package top.zw.ioc.v2;

/**
 * @author zhangwang
 * @version 1.0.0
 * @ClassName SingletonBeanRegistry
 * @createTime 2021年12月08日 21:47:43
 **/
public interface SingletonBeanRegistry {

    Object getSingletonRegistry(String beanName);

}
