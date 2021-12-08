package top.zw.test.v2;

import top.zw.ioc.v2.BeanDefinition;
import top.zw.ioc.v2.BeansException;
import top.zw.ioc.v2.DefaultListableBeanFactory;
import top.zw.test.UserService;

/**
 * @author zhangwang
 * @version 1.0.0
 * @ClassName Test
 * @createTime 2021年12月08日 22:33:42
 **/
public class Test {

    @org.junit.Test
    public void test(){
        DefaultListableBeanFactory beanFactory = new DefaultListableBeanFactory();
        beanFactory.registerBeanDefinition("userService",new BeanDefinition(UserService.class));
        UserService userService = null;
        try {
            userService = (UserService) beanFactory.getBean("userService");
        } catch (BeansException e) {
            e.printStackTrace();
        }
        userService.queryUserInfo();
    }
}
