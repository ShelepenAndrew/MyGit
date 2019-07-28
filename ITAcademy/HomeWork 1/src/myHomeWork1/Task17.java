package myHomeWork1;

public class Task17 {
    /*
    Все элементы массива поделить на значение наибольшего элемента этого
    массива.
    */
    public static void main(String[] args) {
        double[] array = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
        System.out.print("default array: ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
        System.out.print("max value in array: ");

        int maxValue = 0;
        for (int a = 0; a < array.length; a++) {
            if (maxValue < array[a]) {
                maxValue = (int) array[a];
            }
        }
        System.out.println(maxValue);
        System.out.print("new array: ");
        for (int q = 0; q < array.length; q++) {
            array[q] = array[q] / maxValue;
            System.out.print(array[q] + " ");
        }
    }
}
