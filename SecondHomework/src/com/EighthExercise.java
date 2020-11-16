package com;

public class EighthExercise {
    public static void main(String[] args) {
        int[]arr = new int[10];
        int len=0;
        for(int i=1;len<arr.length;i+=2){
            arr[len]=i;
            if(len==arr.length-1){
                System.out.print(arr[len]);
                len++;
                continue;
            }
            System.out.print(arr[len]+",");
            len++;
        }
    }
}
