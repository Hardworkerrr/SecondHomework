package com;

import java.util.Scanner;

public class ThirdExercise {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Здравствуйте, вас приветсвует украинский банк Приват24!");
        System.out.println("Только сегодня действует акция c повышенным процентом годовых!");
        System.out.println("Хотите ли вы внести денежный депозит ? 1-да,0-нет");
        int k = in.nextInt();
        if (k == 1) {
            System.out.println("Введите пожалуйста сумму денежного вклада в гривнах : ");
            double sum = in.nextDouble();//Сумма денежного вклада
            System.out.println("Сумма Вашего денежного вклада = " + sum + " грн");
            double interestRate = 0.08D;//Процентная ставка 8 процентов
            System.out.println("Так как сегодня у нас акция, вы получаете процентную ставку размером " + (interestRate * 100) + " процентов годовых");
            System.out.println("Введите пожалуйста длительность вклада(лет) : ");
            int years = in.nextInt();
            System.out.println("Длительность вклада составляет : " + years);
            double[] yearsSum = new double[years];//Сумма накопительных за каждый год
            for (int i = 0; i < years; i++) {
                yearsSum[i] = sum * interestRate;
                sum += yearsSum[i];
                System.out.println("За " + (i + 1) + " год сумма накопительных будет равна " + yearsSum[i]);
            }
            System.out.println("Таким образом сумма вклада с процентами = " + sum + " грн");
        }

    }

}
