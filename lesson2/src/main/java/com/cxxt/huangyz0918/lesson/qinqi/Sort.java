package com.cxxt.huangyz0918.lesson.qinqi;

import java.util.Arrays;

/**
* @author Dell
* */
public class Sort {
    public static void main(String[] args){
        int[] t = {1,4,2,6,4,5,8,6};
        bubbleSort(t);
//        System.out.println(Arrays.toString(t));
    }

    public static void bubbleSort(int[] a){
        for(int i=0;i<a.length;i++){
            for(int j=1;j<a.length-i;j++){
                if(a[j-1]>a[j]){
                    int temp;
                    temp = a[j];

                    a[j] = a[j-1];
                    a[j-1] = temp;
                }
            }
        }
    }


}
