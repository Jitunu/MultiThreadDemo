package com.mtd.proxy;

import java.lang.reflect.Proxy;

public class JdkProxyDemo {

    public static void main(String[] args) {
        PrintHelloInvocationHandler printHelloInvocationHandler = new PrintHelloInvocationHandler(new PrintHelloImpl());
        IPrintHello printHello = (IPrintHello)Proxy.newProxyInstance(
                                JdkProxyDemo.class.getClassLoader(),
                                new Class[] {IPrintHello.class},
                                printHelloInvocationHandler);
        printHello.printHelloMethod("Jitunu");
    }



}
