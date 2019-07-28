package myHomeWork1;

public class Task12 {
    /*
    Напишите программу, в которой используются две переменные логического
    типа (boolean), присвойте им значения и выведете для каждой переменной
    на экран строку "истина", если переменная имеет значение true и "ложь",
    если переменная имеет значение false.
    */
    public static void main(String[] args) {
        boolean a = true;
        boolean b = false;
        if (a == true) {
            System.out.println("a = " + a + " истина");
        } else {
            System.out.println("a = " + a + " ложь");
        }

        if (b == true) {
            System.out.println("b = " + b + " истина");
        } else {
            System.out.println("b = " + b + " ложь");
        }
    }
}
