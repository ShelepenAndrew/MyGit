package myHomeWork1;

public class Task3 {
    /*
    Напишите метод, который будет проверять является ли число палиндромом
    (одинаково читающееся в обоих направлениях).
    */
    public static void main(String[] args) {
        int num = 123454321;
        int numCopy = num;
        int reverseNum = 0;

        while (numCopy != 0) {
            reverseNum = reverseNum * 10 + numCopy % 10;
            numCopy /= 10;
        }
        if (reverseNum == num) {
            System.out.println(num + " is a palindrome!");
        } else {
            System.out.println(num + " is not a palindrome!");
        }
    }
}
