package Bai4;

import java.io.*;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        try {
            FileInputStream fileIn = new FileInputStream("DATA.in");
            ObjectInputStream in = new ObjectInputStream(fileIn);
            ArrayList<String> list = (ArrayList<String>) in.readObject();
            in.close();
            fileIn.close();

            for (String s : list) {
                StringBuilder binaryString = new StringBuilder();
                for (char c : s.toCharArray()) {
                    if (c == '0' || c == '1') {
                        binaryString.append(c);
                    }
                }
                if (binaryString.length() > 0) {
                    long decimalValue = Long.parseLong(binaryString.toString(), 2);
                    System.out.println( binaryString+" "+ decimalValue);
                }
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found.");
        } catch (IOException e) {
            System.out.println("Error reading file.");
        } catch (ClassNotFoundException e) {
            System.out.println("Class not found.");
        }
    }
}