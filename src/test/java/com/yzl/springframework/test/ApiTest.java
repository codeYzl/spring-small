package com.yzl.springframework.test;

import com.yzl.springframework.BeanDefinition;
import com.yzl.springframework.BeanFactory;
import com.yzl.springframework.test.bean.UserService;
import org.junit.Test;
public  class ApiTest  {
        @Test
        public  void testBean() {
                //1.初始化beanFactory
                BeanFactory beanFactory = new BeanFactory();
                //2.注册bean
                BeanDefinition beanDefinition = new BeanDefinition(new UserService());
                beanFactory.registerBeanDefinition("userService",beanDefinition);

                //3。获取bean
                UserService userService = (UserService)  beanFactory.getBean("userService");
                userService.queryUserInfo();
        }

}


