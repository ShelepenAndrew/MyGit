package myHomeWork2;

public class Task13 {
    /*
    Write a Java program to find the duplicate values of an array of
    string values.

    Написать Java-программу для поиска дублирующихся значений
    массива строковых значений.
    */
    public static void main(String[] args) {
        String[] array = {"a", "c", "c", "d", "e", "g", "g", "h",};
        System.out.print("default array: ");
        for (int a = 0; a < array.length; a++) {
            System.out.print(array[a] + " ");
        }
        System.out.println();

        for (int i = 0; i < array.length; i++) {
            for (int q = i + 1; q < array.length; q++) {
                if (array[q] == array[i]) {
                    System.out.println("Duplicates elements: " + array[q]);
                }
            }
        }
    }
}
