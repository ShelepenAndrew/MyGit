package myHomeWork2;

import java.util.ArrayList;

public class Task16 {
    /*
    Write a Java program to remove duplicate elements from an array.

    Напишите Java-программу для удаления дублирующихся элементов из массива.
    */
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 2, 5, 6, 7, 8, 9, 10};
        ArrayList<Integer> newArrayList = new ArrayList<>(array.length);

        for (int a = 0; a < array.length; a++) {
            int temp = array[a];
            for (int b = a + 1; b < array.length - 1; b++) {
                if (temp == array[b]) {
                    array[a] = 0;
                    array[b] = 0;
                }
            }
        }

        for (int b = 0; b < array.length; b++) {
            if (array[b] != 0) {
                newArrayList.add(array[b]);
            }
        }

        for (Integer q : newArrayList) {
            System.out.println(q);
        }
//

//        for (int tem = 0; tem < array.length; tem++) {
//            Integer temp = array[tem];
//            newArrayList.add(temp);
//            System.out.print(newArrayList.get(tem) + " ");
//        }
//
//
//        for (int i = 0; i < newArrayList.size(); i++) {
//            for (int j = i++; j < newArrayList.size(); j++) {
//                if (newArrayList.get(j).equals(newArrayList.get(i))) {
//                    newArrayList.remove(newArrayList.get(i));
//                }
//            }
//        }
    }
}
