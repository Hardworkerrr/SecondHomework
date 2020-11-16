package com;

import java.util.Scanner;

public class ThirdExercise {
    public static void main(String[] args) {
        int i = 1;
        while (i <= 99) {
            System.out.println(i);
            i += 2;
        }
        Scanner in = new Scanner(System.in);
        System.out.println("Введите число n : ");
        int k=1;
        int n=in.nextInt();
        long res = 1L;
        while(k<=n){
            res*=k;
            k++;
        }
        System.out.println(res);
    }
}
