package com.cxxt.huangyz0918.lesson;


/**
 * @author huangyz0918
 *     Created: Tue Nov 13 15:21:29 CST 2018
 */
public class Two {
    public Two() {

    }

    public static void main(String[] args) {
//    System.out.println("Hello World");
    }

    public static void sort(int[] a) {
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length - 1 - i; j++) {
                int temp = 0;
                if (a[i] < a[i + 1]) {
                    temp = a[i];
                    a[i] = a[i + 1];
                    a[i + 1] = temp;
                }
            }
        }
    }
}