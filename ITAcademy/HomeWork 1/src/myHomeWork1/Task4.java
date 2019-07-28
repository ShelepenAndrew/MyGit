package myHomeWork1;

public class Task4 {
    /*
    Вывести на экран все четные цифры от 1 до 100 (используйте остаток
    от деления)
    */
    public static void main(String[] args) {
        for (int a = 1; a <= 100; a++) {
            if (a % 2 == 0) {
                System.out.print(a + " ");
            }
        }
    }
}
