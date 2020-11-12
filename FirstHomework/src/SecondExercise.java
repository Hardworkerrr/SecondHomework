import java.util.Scanner;

public class SecondExercise {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите количество чисел : ");
        int k;//Количество чисел
        int avg = 0;//Среднее арифметическое
        if (in.hasNextInt()) {
            k = in.nextInt();
        } else {
            System.out.println("Error");
            return;
        }
        System.out.println("Количество чисел : " + k);
        int[] arr = new int[k];
        System.out.println("Введите значения чисел : ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = in.nextInt();
            avg += arr[i];
        }
        System.out.println("Вы ввели : ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        System.out.println("Среднее арифметическое введенных чисел = " + ((double) avg / arr.length));

    }
}
