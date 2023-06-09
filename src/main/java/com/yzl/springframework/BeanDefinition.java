package com.yzl.springframework;

public class BeanDefinition {
    private Object bean;
    private Object bean1;

    public  BeanDefinition(Object bean){
        this.bean = bean;
    }
    public Object getBean(){
        return bean;
    }
}
