package streamAPI;

import java.util.*;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        List<String> listForStreams = Arrays.asList("a1", "a2", "a2", "a3", "AsswWWW", "aaasdfgsdfgshshaaAaaa");

        //1. Получить уникальные строки
        String collect = listForStreams.stream().distinct().collect(Collectors.joining(","));
        System.out.println(collect);

        //2. Вывести строки длиной больше 10
        List<String> collect1 = listForStreams.stream().filter(s -> s.length() > 10).distinct().collect(Collectors.toList());
        System.out.println(collect1);

        //3. Вывести получаемую строку в upperCAse and LowerCase
        List<String> collect2 = listForStreams.stream().map(s -> s.toUpperCase()).distinct().collect(Collectors.toList());
        System.out.println(collect2);


        //4. Дан массив int[] array = new int[]{1, 2, 3, 4, 5, 6, 2, 3}
        //подсчитать количество вхождений каждого элемента массива и вывести элемент с максимальным вхождением
        List<String> lst = new ArrayList<String>();

        lst.add("1");
        lst.add("2");
        lst.add("3");
        lst.add("4");
        lst.add("5");
        lst.add("6");
        lst.add("2");
        lst.add("3");

        Map<String, Integer> duplic = new HashMap<String, Integer>();
        for (String string : lst) {
            if (duplic.keySet().contains(string)) {
                duplic.put(string, duplic.get(string) + 1);
            } else {
                duplic.put(string, 1);
            }
        }
        System.out.println("Duplicate: " + duplic);
    }
}

