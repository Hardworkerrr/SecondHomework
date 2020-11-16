package com;

import java.util.Scanner;

public class ThirteenthExercise {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int k;//Для цикла do while
        int b;//Для switch
        char[][] arr = new char[8][8];
        do {
            System.out.println("Выберите каким методом вы хотите создать поле шахматной доски: 1-медленный метод, 2-быстрый метод");
            b = in.nextInt();
            switch (b) {
                case 1:
                    chessBoardCreate(arr);
                    chessBoardCheck(arr);
                    break;
                case 2:
                    chessBoardAlternative(arr);
                    chessBoardCheck(arr);
                    break;
            }
            System.out.println("Хотите ли вы протестировать другой метод создания шахматной доски ? 1-да, 0-нет");
            k = in.nextInt();
        } while (k == 1);
    }

    public static void chessBoardCreate(char[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (i % 2 == 0) {
                for (int j = 0; j < arr[0].length; j++) {
                    if (j % 2 == 0) {
                        arr[i][j] = 'W';
                        continue;
                    }
                    arr[i][j] = 'B';
                }
            }
            if ((i % 2) != 0) {
                for (int j = 0; j < arr.length; j++) {
                    if (j % 2 != 0) {
                        arr[i][j] = 'W';
                        continue;
                    }
                    arr[i][j] = 'B';
                }
            }
        }
    }

    public static void chessBoardAlternative(char[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                if ((i + j) % 2 == 0) {
                    arr[i][j] = 'W';
                } else arr[i][j] = 'B';
            }
        }
    }

    public static void chessBoardCheck(char[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}

