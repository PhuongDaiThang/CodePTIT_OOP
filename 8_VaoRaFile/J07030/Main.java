package J07030;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ObjectInputStream ois1 = new ObjectInputStream(new FileInputStream("DATA1.in"));
        ObjectInputStream ois2 = new ObjectInputStream(new FileInputStream("DATA2.in"));
        Set<Integer> primes1 = new HashSet<>(), primes2 = new HashSet<>();
        for (int i : (ArrayList<Integer>) ois1.readObject()) if (isPrime(i)) primes1.add(i);
        for (int i : (ArrayList<Integer>) ois2.readObject()) if (isPrime(i)) primes2.add(i);
        ois1.close();
        ois2.close();
        TreeSet<Integer> result = new TreeSet<>();
        for (int n : primes1) {
            int m = 1000000 - n;
            if (m > n && primes2.contains(m)) result.add(n);
        }
        for (int n : result)
            System.out.println(n + " " + (1000000 - n));
    }

    public static boolean isPrime(int n) {
        if (n < 2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
