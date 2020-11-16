package com;

public class SixthTask {
    public static void main(String[] args) {
        int res = 0;
        for (int i = 0; i < 10; i++) {
            if (i == 0) {
                System.out.print(res + " ");
                continue;
            }
            res -= 5;
            System.out.print(res + " ");
        }
    }
}
