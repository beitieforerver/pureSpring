package com.beitie.spring;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.InstantiationAwareBeanPostProcessorAdapter;

public class MyInstantiationProcessor  extends InstantiationAwareBeanPostProcessorAdapter {
    protected Log log = LogFactory.getLog(this.getClass());
    public MyInstantiationProcessor() {
        super();
        log.info("调用MyInstantiationProcessor构造器");
    }

    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        log.info("调用MyInstantiationProcessor的postProcessBeforeInitialization方法");
        return super.postProcessBeforeInitialization(bean, beanName);
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        log.info("调用MyInstantiationProcessor的postProcessAfterInitialization方法");
        return super.postProcessAfterInitialization(bean, beanName);
    }
}
