package com.mtd.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class PrintHelloInvocationHandler implements InvocationHandler {

    private IPrintHello iPrintHello;

    PrintHelloInvocationHandler(IPrintHello iPrintHello) {
        this.iPrintHello = iPrintHello;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("::::::Before Method Execution::::::");
        Object result = method.invoke(iPrintHello, args[0]);
        System.out.println("::::::After Method Execution::::::");
        return result;
    }
}
