package top.zw.test.v1;

import top.zw.ioc.v1.BeanDefinition;
import top.zw.ioc.v1.BeanFactory;
import top.zw.test.UserService;

/**
 * @author zhangwang
 * @version 1.0.0
 * @ClassName Test
 * @createTime 2021年12月08日 21:33:10
 **/
public class Test {

    @org.junit.Test
    public void test1() {
        BeanFactory beanFactory = new BeanFactory();
        BeanDefinition beanDefinition = new BeanDefinition(new UserService());
        beanFactory.registerBeanDefinition("userService", beanDefinition);

        UserService userService = (UserService) beanFactory.getBean("userService");
        userService.queryUserInfo();
    }
}
