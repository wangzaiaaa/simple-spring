package top.zw.ioc.v2;

import java.util.Map;
import java.util.Optional;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @author zhangwang
 * @version 1.0.0
 * @ClassName DefaultListableBeanFactory
 * @createTime 2021年12月08日 22:13:14
 **/
public class DefaultListableBeanFactory extends AbstractAutowireCapableBeanFactory implements BeanDefinitionRegistry {

    private Map<String, BeanDefinition> beanDefinitionMap = new ConcurrentHashMap<>();

    @Override
    protected BeanDefinition getBeanDefinition(String beanName) throws BeansException {
        BeanDefinition beanDefinition = beanDefinitionMap.get(beanName);
        Optional.ofNullable(beanDefinition).orElseThrow(() -> {
            return new BeansException("No Bean named " + beanName + " is defined");
        });
        return beanDefinition;
    }

    @Override
    public void registerBeanDefinition(String name, BeanDefinition definition) {
        beanDefinitionMap.put(name,definition);
    }
}
