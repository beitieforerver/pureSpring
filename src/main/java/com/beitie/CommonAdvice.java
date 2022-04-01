package com.beitie;

import com.beitie.service.impl.BaseServiceImpl;
import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

public class CommonAdvice extends BaseServiceImpl implements MethodInterceptor {
    @Override
    public Object invoke(MethodInvocation methodInvocation) throws Throwable {
        log.info("前置");
        Object proceed = methodInvocation.proceed();
        log.info("后置");
        return proceed;
    }
}
