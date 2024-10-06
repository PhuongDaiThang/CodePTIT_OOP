package DocFile;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = readNumbersFromFile("DAYSO.DAT");
        
        Set<Integer> primeNumbers = new TreeSet<>();
        
        for (Integer number : numbers) {
            if (isPrime(number) && number >= 100) {
                primeNumbers.add(number);
            }
        }
        
        for (Integer prime : primeNumbers) {
            System.out.println(prime);
        }
    }

    public static ArrayList<Integer> readNumbersFromFile(String fileName) {
        ArrayList<Integer> numbers = new ArrayList<>();
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(fileName))) {
            numbers = (ArrayList<Integer>) ois.readObject();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return numbers;
    }

    public static boolean isPrime(int n) {
        if (n < 2) return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) return false;
        }
        return true;
    }
}
