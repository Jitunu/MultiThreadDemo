package com.mtd.dataStructure;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListDemo<T> {

    Object[] tempArray = new Object[5];
    int size = 0;

    public void add(T val){
        if(size < tempArray.length) {
            tempArray[size] = val;
            size = size + 1;
        } else {
            tempArray = Arrays.copyOf(tempArray,10);
        }
    }

    public T get(int index) {
        if(index < tempArray.length) {
            return (T) tempArray[index];
        } else {
            throw new RuntimeException("Array Index out of bound exception");
        }
    }

    public static void main(String[] args) {
        ArrayListDemo<String> arrayListDemo = new ArrayListDemo<>();
        arrayListDemo.add("Jitunu");
        arrayListDemo.add("Rajashree");
        arrayListDemo.add("Santanu");
        arrayListDemo.add("Arupananda1");
        arrayListDemo.add("Arupananda2");
        arrayListDemo.add("Arupananda3");
        arrayListDemo.add("Arupananda4");
        arrayListDemo.add("Sakuntala1");
        arrayListDemo.add("Sakuntala2");
        arrayListDemo.add("Sakuntala3");
        arrayListDemo.add("Sakuntala4");
        arrayListDemo.add("Jitunuq111");
        arrayListDemo.add("Rajashreeqqqq");
        arrayListDemo.add("Santanudsd");
        arrayListDemo.add("Arupananda1");
        arrayListDemo.add("Arupananda2");
        arrayListDemo.add("Arupananda3");
        arrayListDemo.add("Arupananda4");
        arrayListDemo.add("Sakuntala1");
        arrayListDemo.add("Sakuntala2");
        arrayListDemo.add("Sakuntala3");
        arrayListDemo.add("Sakuntala4");

        for(int i = 0; i < arrayListDemo.size; i++) {
            System.out.println(arrayListDemo.get(i));
        }
    }
}
