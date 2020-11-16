package com;

import java.util.Arrays;
import java.util.Scanner;
//11-12 ЗАДАНИЕ
public class EleventhTwelfthExercise {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите размерность массива : ");
        int len = in.nextInt();
        int[] arr = new int[len];
        int indexMin = 0;
        int indexMax = 0;
        System.out.println("Введите элементы массива : ");
        for (int i = 0; i < len; i++) {
            arr[i] = in.nextInt();
        }
        System.out.println("Массив - " + Arrays.toString(arr));
        int min = arr[0];
        int max = arr[0];
        for (int i = 0; i < len - 1; i++) {
            if (min > arr[i + 1]) {
                min = arr[i + 1];
                indexMin = i + 1;
            }
            if (max < arr[i + 1]) {
                max = arr[i + 1];
                indexMax = i + 1;
            }
        }
        arr[indexMin]=max;
        arr[indexMax]=min;
        System.out.println("Массив с измененными элементами - " + Arrays.toString(arr));
        System.out.println("==============================================");
        double sum=0.0D;
        for(int i=0;i<len;i++){
            sum+=arr[i];
        }
        System.out.println("Среднее арифметическое элементов массива = "+(double)(sum/len));
    }
}
