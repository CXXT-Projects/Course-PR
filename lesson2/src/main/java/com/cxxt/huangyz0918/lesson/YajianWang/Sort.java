package com.cxxt.huangyz0918.lesson.YajianWang;

public class Sort {
    public Sort() {
    }

    public static void main(String[] args) {
        int[] a = {1, 3, 2, 5, 6, 8, 9, 7};
        bubble_sort(a);
        for(int i : a) {
            System.out.print(i);
        }

    }

    public static void bubble_sort(int[] a) {
        for(int i = 0; i < a.length; ++i) {
            for(int j = 0; j < a.length - i - 1; ++j) {
                if (a[j] < a[j + 1]) {
                    int temp = a[j + 1];
                    a[j + 1] = a[j];
                    a[j] = temp;
                }
            }
        }

    }
}
