package myHomeWork1;

import java.util.Scanner;

public class Task1 {
    /*
     Напишите программу, которая вычисляет ваш вес на Луне с учетом того,
     что сила тяжести равна 16% от силы тяжести на Земле.
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter your weight, kg: ");
        Double weight = in.nextDouble();
        Double weightOnTheMoon = weight * 16 / 100;
        System.out.println("Your weight on the moon: " + weightOnTheMoon + " kg");
    }
}
