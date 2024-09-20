package com.mtd.outerclass;

public class OuterClass {
    private int outerVar;
 
    public OuterClass(int var) {
        outerVar = var;
    }
 
    public void outerMethod() {
        System.out.println("This is an outer method");
    }
 
    // Inner class
    public class InnerClass {
        private int innerVar;
 
        public InnerClass(int var) {
            innerVar = var;
        }
 
        public void innerMethod() {
            System.out.println("This is an inner method");
        }
 
        public void accessOuterVar() {
            System.out.println("Outer variable from inner class: " + outerVar);
        }
    }
 
    public static void main(String[] args) {
        // Create an instance of the outer class
        OuterClass outer = new OuterClass(10);
 
        // Create an instance of the inner class
        OuterClass.InnerClass inner = outer.new InnerClass(20);
 
        // Access the inner class methods
        inner.innerMethod();
        inner.accessOuterVar();

    }
}