package com.beitie.spring;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    protected static Log log = LogFactory.getLog(Test.class);
    public static void main(String[] args) {
       log.info("----容器启动----");
        ClassPathXmlApplicationContext xml =new ClassPathXmlApplicationContext("spring-lifecycle-test.xml");
       log.info("----启动完成----");
        Person person=xml.getBean("person",Person.class);
       log.info("获取延迟加载对象student"+person.toString());
        Student student=xml.getBean("student",Student.class);
       log.info("获取加载对象studentPrototype"+student.toString());
        Student studentPrototype=xml.getBean("studentPrototype",Student.class);
       log.info("---准备关闭spring容器-----"+studentPrototype.toString());
        xml.registerShutdownHook();
    }
}
