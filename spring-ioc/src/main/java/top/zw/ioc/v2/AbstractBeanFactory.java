package top.zw.ioc.v2;

/**
 * @author zhangwang
 * @version 1.0.0
 * @ClassName AbstractBeanFactory
 * @createTime 2021年12月08日 21:52:04
 **/
public abstract class AbstractBeanFactory extends DefaultSingletonBeanRegistry implements BeanFactory {


    @Override
    public Object getBean(String name) throws BeansException {
        Object bean = getSingletonRegistry(name);
        if (bean != null) {
            return bean;
        }
        return createBean(name,getBeanDefinition(name));

    }

    protected abstract BeanDefinition getBeanDefinition(String beanName) throws BeansException;

    protected abstract Object createBean(String beanName,BeanDefinition beanDefinition) throws BeansException;


}
