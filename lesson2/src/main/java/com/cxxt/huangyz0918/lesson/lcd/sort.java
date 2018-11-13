package com.cxxt.huangyz0918.lesson.lcd;

public class sort {
    public static void main(String[] args){

    }
    public static void bubble(int[] a){
        for (int i=0;i<a.length;i++){
            for(int j=0;j<a.length-i-1;j++){
                int temp=0;
                if(a[j]<a[j+1]){
                    temp=a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp;
                }
            }
        }
    }
}
