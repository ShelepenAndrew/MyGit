package streamInOut;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        FileWriter fileWriter;
        BufferedWriter bufferedWriter;
        PrintWriter printWriter = null;
        try (FileWriter testWriter = new FileWriter("test2.txt")) {
            fileWriter = new FileWriter("test.txt");
            bufferedWriter = new BufferedWriter(fileWriter);
            printWriter = new PrintWriter(bufferedWriter);

            int arr[] = new int[10];
            for (int i = 0; i < arr.length; i++) {
                arr[i] = (int) (Math.random() * 100);
                System.out.print(arr[i] + "  ");
                printWriter.println(arr[i]);
            }

            System.out.print("\nSorted: \n");
            Arrays.sort(arr);
            for (int i = 0; i < arr.length; i++) {
                System.out.print(arr[i] + "  ");
                String s = Integer.toString(arr[i]);
                testWriter.write(s + "\n");
            }

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            printWriter.close();
        }
    }
}