package com;

import java.util.Scanner;

public class SecondExercise {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите число n : ");
        int n = in.nextInt();
        long res = 1L;
        for (int i = 1; i <= n; i++) {
            res *= i;
        }
        System.out.println("Факториал числа " + n + " = " + res);
    }
}
