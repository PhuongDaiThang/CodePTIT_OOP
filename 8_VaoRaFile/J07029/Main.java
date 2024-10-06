package J07029;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

public class Main{
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ObjectInputStream sc = new ObjectInputStream(new FileInputStream("DATA.in"));
        ArrayList<Integer> list = (ArrayList<Integer>) sc.readObject();
        sc.close();

        HashMap<Integer, Integer> primeCount = new HashMap<>();

        for (int i : list) {
            if (isPrime(i)) {
                primeCount.put(i, primeCount.getOrDefault(i, 0) + 1);
            }
        }

        ArrayList<Integer> prime = new ArrayList<>(primeCount.keySet());

        Collections.sort(prime, Collections.reverseOrder());

        for (int i = 0; i < Math.min(10, prime.size()); i++) {
            System.out.println(prime.get(i) + " " + primeCount.get(prime.get(i)));
        }
    }

    public static boolean isPrime(int n){
        if(n<2){
            return false;
        }
        for(int i=2;i<=Math.sqrt(n);i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
}