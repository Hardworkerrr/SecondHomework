package com;

import java.util.Scanner;

public class SeventhExercise {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите число x :");
        int x = in.nextInt();
        System.out.println("Таблица умножения на " + x);
        for (int i = 1; i <= 10; i++) {
            System.out.println(x + " * " + i + " = " + (x * i));
        }
    }
}
