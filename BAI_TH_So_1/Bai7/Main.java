package Bai7;
 
import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        try {
            File file = new File("VANBAN.in");
            Scanner sc = new Scanner(file);
            Set<String> words = new TreeSet<>();

            while (sc.hasNextLine()) {
                String line = sc.nextLine();
                String[] parts = line.split("\\s+");
                for (String word : parts) {
                    if (containsDigit(word) && !containsPunctuation(word)) {
                        words.add(word);
                    }
                }
            }
            sc.close();

            for (String word : words) {
                System.out.println(word);
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found.");
        }
    }

    public static boolean containsDigit(String word) {
        for (char c : word.toCharArray()) {
            if (Character.isDigit(c)) {
                return true;
            }
        }
        return false;
    }

    public static boolean containsPunctuation(String word) {
        char[] punctuations = {'.', ',', '!', '?', ':'};
        for (char c : word.toCharArray()) {
            for (char p : punctuations) {
                if (c == p) {
                    return true;
                }
            }
        }
        return false;
    }
}
