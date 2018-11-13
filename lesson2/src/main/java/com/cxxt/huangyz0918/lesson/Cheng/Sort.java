package com.cxxt.huangyz0918.lesson.Cheng;

import java.util.Arrays;

public class Sort {
    public static void main(String[] args){
        int[] a = {1,3,5,4,2,7,6,8,9};
        bubbleSort(a);
        System.out.println(Arrays.toString(a));
    }

    public static void bubbleSort(int[] a){
        for (int i = 0; i < a.length ; i++) {
            for (int j = 0; j < a.length -1 -i; j++) {
                int temp = 0;
                if(a[j] < a[j + 1]){
                    temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                }
            }
        }
    }

}
