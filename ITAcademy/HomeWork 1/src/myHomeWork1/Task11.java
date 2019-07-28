package myHomeWork1;

public class Task11 {
    /*
    Напишите программу с тремя переменными целого типа.
    Определить какое из них наибольшее.
    */
    public static void main(String[] args) {
        int a = 3;
        int b = 1;
        int c = 5;
        if (a > b && a > c) {
            System.out.println("maximum value a = " + a);
        } else if (b > a && b > c) {
            System.out.println("maximum value b = " + b);
        } else if (c > a && c > b) {
            System.out.println("maximum value c = " + c);
        } else {
            System.out.println("error");
        }
    }
}
