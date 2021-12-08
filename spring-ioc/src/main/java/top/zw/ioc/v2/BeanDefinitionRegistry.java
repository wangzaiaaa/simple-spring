package top.zw.ioc.v2;

/**
 * @author zhangwang
 * @version 1.0.0
 * @ClassName BeanDefinitionRegistry
 * @createTime 2021年12月08日 22:24:29
 **/
public interface BeanDefinitionRegistry {

    void registerBeanDefinition(String name,BeanDefinition definition);
}
