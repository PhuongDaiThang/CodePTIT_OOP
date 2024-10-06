package Bai5;

import java.io.*;
import java.util.ArrayList;
import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        try {
            FileInputStream fileIn = new FileInputStream("DAYSO.DAT");
            ObjectInputStream in = new ObjectInputStream(fileIn);
            ArrayList<Integer> list = (ArrayList<Integer>) in.readObject();
            in.close();
            fileIn.close();

            Set<Integer> primes = new TreeSet<>();

            for (int num : list) {
                if (num >= 100 && isPrime(num)) {
                    primes.add(num);
                }
            }

            for (int prime : primes) {
                System.out.println(prime);
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found.");
        } catch (IOException e) {
            System.out.println("Error reading file.");
        } catch (ClassNotFoundException e) {
            System.out.println("Class not found.");
        }
    }

    public static boolean isPrime(int num) {
        if (num < 2) return false;
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) return false;
        }
        return true;
    }
}