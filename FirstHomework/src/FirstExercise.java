import java.util.Scanner;

//Программа, которая находит среднее арифметическое значение двух чисел.
public class FirstExercise {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите значение числа k : ");
        int k, b;
        if (in.hasNextInt()) {
            k = in.nextInt();
        } else {
            System.out.println("Error");
            return;
        }
        System.out.println("Введите значение числа b : ");
        if (in.hasNextInt()) {
            b = in.nextInt();
        } else {
            System.out.println("Error");
            return;
        }
        System.out.println("Число k = " + k);
        System.out.println("Число k = " + b);
        System.out.println("Среднее арифметическое этих двух чисел будет равно : " + ((double) (k + b) / 2));
    }
}
