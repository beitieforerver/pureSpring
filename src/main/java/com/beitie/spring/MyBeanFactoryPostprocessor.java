package com.beitie.spring;

import com.beitie.util.LogBean;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;

public class MyBeanFactoryPostprocessor extends LogBean implements BeanFactoryPostProcessor {

    public MyBeanFactoryPostprocessor() {
        super();
        log.info("这是BeanFactoryPostProcessor实现类构造器！！");
    }
    @Override
    public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
        log.info("BeanFactoryPostProcessor调用postProcessBeanFactory方法");
        BeanDefinition bd = beanFactory.getBeanDefinition("student");
        bd.getPropertyValues().addPropertyValue("name", "清风");
    }
}
