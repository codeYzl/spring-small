package com.yzl.springframework.beans.factory;

import com.yzl.springframework.beans.BeansException;

public interface BeanFactory {
    Object getBean(String name) throws BeansException;
}
