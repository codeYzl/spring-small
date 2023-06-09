package com.yzl.springframework.beans.factory.config;

import java.util.Calendar;

public class BeanDefinition {
    private Class beanClass;

    public  BeanDefinition(Class beanClass){
        this.beanClass = beanClass;
    }
    public Class getBean(){
        return beanClass;
    }
}
