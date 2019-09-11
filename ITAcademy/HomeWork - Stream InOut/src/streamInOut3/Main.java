package streamInOut3;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {

        FileReader file = new FileReader("text.txt"); // added file
        BufferedReader reader = new BufferedReader(file);

        int sentencesCount = 0; // sentence
        int wordsCount = 0; // words
        int paragraphsCount = 1; // paragraphs
        String line;

        while ((line = reader.readLine()) != null) {
            int countSentences = countSentences(line, "?", "!", "."); //sentence
            int countWords = countWords(line, " "); //words
            sentencesCount += countSentences;
            wordsCount += countWords;

            if (line.equals("")) { //paragraphs
                paragraphsCount++;
            }
        }

        reader.close();
        file.close();
        System.out.println("Number of sentences in the text: " + sentencesCount);
        System.out.println("Number of words in the text: " + wordsCount);
        System.out.println("Number of paragraphs in the text: " + paragraphsCount);

    }

    private static int countSentences(final String str, final String... specialCharacters) {
        if (null == str || str.isEmpty()) {
            return 0;
        }
        if (null == specialCharacters || specialCharacters.length == 0) {
            return 0;
        }
        int count = 0;
        int index = 0;
        for (int i = 0; i < specialCharacters.length; i++) {
            String special = specialCharacters[i];
            index = 0;
            while ((index = str.indexOf(special, index)) != -1) {
                count++;
                index += special.length();
                if (index >= str.length()) {
                    break;
                }
            }
        }
        return count;
    }

    private static int countWords(final String str, final String... specialCharacters) {
        if (null == str || str.isEmpty()) {
            return 0;
        }
        if (null == specialCharacters || specialCharacters.length == 0) {
            return 0;
        }
        int count = 0;
        int index = 0;
        for (int i = 0; i < specialCharacters.length; i++) {
            String special = specialCharacters[i];
            index = 0;
            while ((index = str.indexOf(special, index)) != -1) {
                count++;
                index += special.length();
                if (index >= str.length()) {
                    break;
                }
            }
        }
        return count;
    }
}
