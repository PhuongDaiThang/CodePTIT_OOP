package J07015;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.lang.reflect.Array;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ObjectInputStream inp=new ObjectInputStream(new FileInputStream("SONGUYEN.in"));
        ArrayList<Integer> lst = (ArrayList<Integer>) inp.readObject();
        int []f=new int[10005];
        for(int i:lst)
            if(isPrime(i))
                ++f[i];
        for(int i=2;i<=10000;i++){
            if(f[i]>0){
                System.out.println(i+" "+f[i]);
            }
        }
    }
    static boolean isPrime(int n){
        if (n<2){
            return false;
        }
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
