package com.beitie.spring;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.InstantiationAwareBeanPostProcessorAdapter;

public class MyInstantiationProcessor  extends InstantiationAwareBeanPostProcessorAdapter {
    private static final Log log = LogFactory.getLog(MyInstantiationProcessor.class);
    public MyInstantiationProcessor() {
        super();
        log.info("调用MyInstantiationProcessor构造器");
    }

    @Override
    /**
     * 描述: 
     * @param bean
     * @param beanName 
     * @return: java.lang.Object
     * @Author: wtj
     * @Date: 2023/2/8 19:35
     */
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        log.info("调用InstantiationAwareBeanPostProcessorAdapter的postProcessBeforeInitialization方法");
        Exception e = new Exception();
        log.error("", e);
        return super.postProcessBeforeInitialization(bean, beanName);
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        log.info("调用InstantiationAwareBeanPostProcessorAdapter的postProcessAfterInitialization方法");
        return super.postProcessAfterInitialization(bean, beanName);
    }

}
