package streamInOut2;

import java.io.*;
import java.util.*;

public class Words {

    public static void main(String[] args) throws FileNotFoundException, IOException {
        String[] testWords = new Scanner(new File("exam.txt")).useDelimiter("\\Z").next().split("// ");
        String[] variableOne = new String[testWords.length];

        for (int i = 0; i < variableOne.length; i++) {
            variableOne[i] = testWords[i].trim().replaceAll("(?U)^(\\w+)(.*)(\\b\\w+)([.?!]?$)", "$3$2$1$4");
        }
        for (String variableTwho : variableOne) {
            System.out.println(variableTwho);
        }
    }
}
