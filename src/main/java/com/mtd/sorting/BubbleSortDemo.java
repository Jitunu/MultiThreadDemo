package com.mtd.sorting;



public class BubbleSortDemo {
    public static void main(String[] args) {
        int[] arr = new int[5];
        arr[0] = 11;
        arr[1] = 3;
        arr[2] = 6;
        arr[3] = 15;
        arr[4] = 4;
        System.out.println("Before Sorting an Array");
        for (int a : arr) {
            System.out.print(a+" ");
        }
        int temp = 0;
        int tempArrVal = 0;
        for( int i = 0 ; i < arr.length; i++){
            for (int j = 0; j < arr.length -i - 1; j++) {
                if(arr[j] > arr[j+1]) {
                   temp = arr[j];
                   arr[j] = arr[j+1];
                   arr[j+1] = temp;
                }

                System.out.println("\n After "+j+" Iteration");
                for (int a: arr) {
                    System.out.print(a+" ");
                }
            }

        }

    }
}
