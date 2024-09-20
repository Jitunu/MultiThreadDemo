package com.mtd.immutable;

public class ImmutableDemo {


    class Test {
        public static void testMethod() {
            System.out.println("Inner class");
        }
    }

    public static void main(String[] args) {
        String f = "Jitunu";
        String l = "sahoo";

        ImmutableDemo im = new ImmutableDemo(f,l);
        ImmutableDemo.Test t = im.new Test();
        t.testMethod();

        System.out.println(im.getFirstName());
        System.out.println(im.getLastName());

        f = "Rajashree";
        l = "Sahoo";

        System.out.println(im.getFirstName());
        System.out.println(im.getLastName());

    }
    public String firstName;
    public String lastName;

    public ImmutableDemo(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
    }
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }


}
