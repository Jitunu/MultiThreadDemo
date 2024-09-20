package com.mtd.proxy;

import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

public class CglibInvocationDemo implements MethodInterceptor {

    private PrintMessage cgLibPrintDemo;

    public CglibInvocationDemo(PrintMessage cgLibPrintDemo) {
        this.cgLibPrintDemo = cgLibPrintDemo;
    }

    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {


        Object result = method.invoke(cgLibPrintDemo, objects[0]);
        return result;
    }
}
