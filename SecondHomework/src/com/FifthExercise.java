package com;

import java.util.Scanner;

public class FifthExercise {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите число x : ");
        int x=in.nextInt();
        System.out.println("Введите число n : ");
        int n=in.nextInt();
        int oldX=x;
        while(n>1){
            x*=oldX;
            n--;
        }
        System.out.println("x^n = " + x);
    }
}
