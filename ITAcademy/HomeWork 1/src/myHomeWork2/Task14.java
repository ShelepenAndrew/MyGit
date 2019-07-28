package myHomeWork2;

public class Task14 {
    /*
    Write a Java program to find the common elements between two arrays
    (string values).

    Напишите программу на Java, чтобы найти общие элементы между двумя
    массивами (строковые значения).
    */
    public static void main(String[] args) {
        String[] arrayOne = {"a", "b", "c", "d", "f", "f", "g"};
        String[] arrayTwo = {"a", "i", "j", "k", "c", "m", "n"};

        for (int one = 0; one < arrayOne.length; one++) {
            for (int two = 0; two < arrayTwo.length; two++) {
                if (arrayOne[one] == arrayTwo[two]) {
                    System.out.println("Duplicates elements: " + arrayOne[one]);
                }
            }
        }
    }
}
