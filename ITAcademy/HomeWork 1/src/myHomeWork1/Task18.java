package myHomeWork1;

import java.util.Scanner;

public class Task18 {
    /*
    Напишите метод переводящий рубли в доллары по заданному курсу.
    В качестве аргументов укажите кол-во рублей и курс.
    */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input bel.rub count: ");
        double blrCount = scanner.nextDouble();
        System.out.print("Input bel.rub course: ");
        double blrCourse = scanner.nextDouble();
        System.out.println("You can buy " + (blrCount / blrCourse) + " dollars.");
    }
}
