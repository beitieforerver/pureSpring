package com.beitie.spring;

import com.beitie.util.LogBean;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class MyBeanPostprocessor extends LogBean implements BeanPostProcessor {

    public MyBeanPostprocessor() {
        super();
        log.info("这是BeanPostProcessor实现类构造器！！");
    }
    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        log.info("BeanPostProcessor接口方法postProcessBeforeInitialization对属性进行更改");
        return bean;
    }
    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        log.info("BeanPostProcessor接口方法postProcessAfterInitialization对属性进行更改");
        return bean;
    }
}
