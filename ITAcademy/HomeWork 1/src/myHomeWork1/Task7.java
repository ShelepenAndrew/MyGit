package myHomeWork1;

public class Task7 {
    /*
    Посчитать сумму цифр от 20 до 200 и результат вывести на экран
    (используя цикл for)
    */
    public static void main(String[] args) {
        int sum = 0;
        for (int a = 20; a <= 200; a++) {
            sum += a;
            // sum = sum + a;
        }
        System.out.println("The sum of all numbers from 20 to 200 = " + sum);
    }
}
