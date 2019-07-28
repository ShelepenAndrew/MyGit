package myHomeWork1;

public class Task15 {
    /*
    Выведете на экран все числа от 1 до 100 с помощью цикла
    (можно все три варианта в одной программе):
    for
    while
    do while
    */
    public static void main(String[] args) {

        System.out.println("Cycle FOR:");
        for (int count1 = 1; count1 <= 100; count1++) {
            System.out.print(count1 + " ");
        }
        System.out.println(" ");

        System.out.println("Cycle WHILE:");
        int count2 = 1;
        while (count2 <= 100) {
            System.out.print(count2 + " ");
            count2++;
        }
        System.out.println(" ");

        System.out.println("Cycle DO WHILE:");
        int count3 = 1;
        do {
            System.out.print(count3 + " ");
            count3++;
        } while (count3 <= 100);
    }
}
