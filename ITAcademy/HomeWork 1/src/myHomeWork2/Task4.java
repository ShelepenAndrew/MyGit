package myHomeWork2;

public class Task4 {
    /*
    Write a Java program to calculate the average value of array elements.

    Напишите Java-программу для расчета среднего значения элементов массива.
    */
    public static void main(String[] args) {
        float[] arr = {22, 45, 12, 1, 14, 167};
        float sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }
        System.out.println("average value of array: " + sum / arr.length);
    }
}
