package myHomeWork1;

public class Task2 {
    /*
    Напишите метод, который будет увеличивать каждый элемент массива на 10%.
    */
    public static void main(String[] args) {
        double[] array = {1, 10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
        for (int i = 0; i < array.length; i++) {
            array[i] += array[i] * 0.1;
            System.out.println(array[i]);
        }
    }
}
