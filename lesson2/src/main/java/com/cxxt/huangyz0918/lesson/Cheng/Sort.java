package com.cxxt.huangyz0918.lesson.Cheng;

/**
 * @author Cheng
 *     Created: 2018
 */

public class Sort {

    public static void main(String[] args) {
//        int[] arr = {1, 3, 5, 8, 6, 4, 2, 7, 9};
//        bubbleSort(arr);
//        for (int i = 0; i < arr.length; i++) {
//            System.out.println(arr[i]);
//        }
    }

    public static void bubbleSort(int[] a) {
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length - i - 1; j++) {
                if (a[j] > a[j + 1]) {
                    int temp;
                    temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                }
            }
        }
    }

}
