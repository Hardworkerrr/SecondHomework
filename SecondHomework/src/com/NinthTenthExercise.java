package com;

import java.util.Arrays;
import java.util.Scanner;
//9-10 ЗАДАНИЕ
public class NinthTenthExercise {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите размерность массива : ");
        int len=in.nextInt();
        int[] arr=new int[len];
        System.out.println("Введите элементы массива : ");
        for(int i=0;i<len;i++){
            arr[i]=in.nextInt();
        }
        System.out.println("Массив - " + Arrays.toString(arr));
        int min=arr[0];
        int max=arr[0];
        for (int i = 0; i < len - 1; i++) {
            if (min > arr[i + 1]) {
                min = arr[i + 1];
            }
            if (max < arr[i + 1]) {
                max = arr[i + 1];
            }
        }
        for(int i=0;i<len;i++){
            if(arr[i]==min){
                System.out.println("Элемент под индексом " + (i+1) +" - самый минимальный элемент в массиве. Он равен = " + arr[i]);
            }
        }
        for(int i=0;i<len;i++){
            if(arr[i]==max){
                System.out.println("Элемент под индексом " + (i+1) +" - самый максимальный элемент в массиве. Он равен = " + arr[i]);
            }
        }
    }
}
