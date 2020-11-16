package com;

import java.util.Scanner;

public class FourthExercise {
    public static void main(String[] args) {
        int i = 1;
        do{
            System.out.println(i);
            i+=2;
        }while(i<=99);
        Scanner in = new Scanner(System.in);
        System.out.println("Введите число n : ");
        int k=1;
        int n=in.nextInt();
        long res = 1L;
        do{
            res*=k;
            k++;
        }while(k<=n);
        System.out.println(res);
    }
}
