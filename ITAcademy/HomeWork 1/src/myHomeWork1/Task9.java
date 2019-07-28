package myHomeWork1;

import java.util.Scanner;

public class Task9 {
    /*
    Объявить 2 переменных целого типа. Необходимо поменять значения
    переменных так, чтобы значение первой оказалось во второй,
    а второй - в первой.
    */
    public static void main(String[] args) {
        int temp = 0;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the 1st number: ");
        int number1 = in.nextInt();
        System.out.print("Enter the 2nd number: ");
        int number2 = in.nextInt();
        System.out.println("1st = " + number1 + "; 2nd = " + number2 + "; temp = " + temp);

        temp = number1;
        number1 = number2;
        number2 = temp;
        temp = 0;
        System.out.println("1st = " + number1 + "; 2nd = " + number2 + "; temp = " + temp);
    }
}
