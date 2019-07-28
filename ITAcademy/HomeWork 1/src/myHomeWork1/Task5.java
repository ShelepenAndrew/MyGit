package myHomeWork1;

public class Task5 {
    /*
    Вывести на  экран все нечетные цифры от 1 до 15 (используйте остаток
    от деления)
    */
    public static void main(String[] args) {
        for (int a = 1; a <= 15; a++) {
            if (a % 2 != 0) {
                System.out.print(a + " ");
            }
        }
    }
}
