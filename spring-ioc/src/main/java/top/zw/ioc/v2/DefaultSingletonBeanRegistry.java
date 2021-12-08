package top.zw.ioc.v2;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @author zhangwang
 * @version 1.0.0
 * @ClassName DefaultSingletonBeanRegistry
 * @createTime 2021年12月08日 21:49:13
 **/
public class DefaultSingletonBeanRegistry implements SingletonBeanRegistry {

    private Map<String, Object> singletonBeanContain = new ConcurrentHashMap<>();

    @Override
    public Object getSingletonRegistry(String beanName) {
        return singletonBeanContain.get(beanName);
    }

    protected void registerSingletonBean(String beanName, Object singletonBean) {
        singletonBeanContain.put(beanName, singletonBean);
    }
}
