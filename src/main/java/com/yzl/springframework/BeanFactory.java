package com.yzl.springframework;

import java.util.Collection;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

public class BeanFactory {
    private Map<String,BeanDefinition> beanDefinitionMap = new ConcurrentHashMap<>();
    public Object getBean(String name){
        return beanDefinitionMap.get(name).getBean();
    }
    public void registerBeanDefinition(String name,BeanDefinition beanDefinition){
        beanDefinitionMap.put(name,beanDefinition);
    }
}
