package com.mtd.proxy;

public class PrintHelloImpl implements IPrintHello{

    @Override
    public void printHelloMethod(String name) {
        System.out.println("Hello :: "+name);
    }
}
