package myHomeWork1;

import java.util.Scanner;

public class Task16 {
    /*
    Вывести на экран ряд натуральных чисел от минимума до максимума с шагом.
    Например, если минимум 10, максимум 35, шаг 5, то вывод должен быть
    таким: 10 15 20 25 30 35. Минимум, максимум и шаг указываются
    пользователем (можно захардкодить).
    */
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Enter min of range: ");
        int minRange = in.nextInt();

        System.out.print("Enter max of range: ");
        int maxRange = in.nextInt();

        System.out.print("Enter step of range: ");
        int stepRange = in.nextInt();

        int result = 0;
        result = minRange;
        while (result < maxRange) {
            System.out.print(result + " ");
            result = result + stepRange;
        }
    }
}
