package com.beitie.spring;

import com.beitie.util.LogBean;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.*;

public class Person extends LogBean implements BeanFactoryAware, BeanNameAware, InitializingBean, DisposableBean {

    private String name;
    private int age;
    private String phone;

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Person() {
        super();
        log.info("调用Person的构造器");
    }
    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        log.info("调用Person的setBeanFactory方法");
    }
    @Override
    public void setBeanName(String name) {
        log.info("调用Person的setBeanName方法");
    }
    @Override
    public void destroy() throws Exception {
        log.info("调用Person的destroy方法");
    }
    @Override
    public void afterPropertiesSet() throws Exception {
        log.info("调用Person的afterPropertiesSet方法");
    }

    public void myInit(){
        log.info("调用Person的myInit方法");
    }
    public void myDestroy(){
        log.info("调用Person的myDestroy方法");
    }
}
