package com.cxxt.huangyz0918.lesson.JackWang;

/**
 * @author JackWang
 *     Created: Tue Nov 13 15:21:29 CST 2018
 */

public class Sort {

    public static void main(String[] args) {
//        int[] arr = {1, 2, 3, 8, 6, 4, 5, 7, 9};
//        sort(arr);
//        for (int i = 0; i < arr.length; i++) {
//            System.out.println(arr[i]);
//        }
    }

    public static void sort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                int temp;
                if (arr[j + 1] > arr[j]) {
                    temp = arr[j + 1];
                    arr[j + 1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }

}

