package J07004;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        File file=new File("DATA.in");
        Scanner sc = new Scanner(file);

        TreeMap<Integer, Integer> countMap = new TreeMap<>();

        while (sc.hasNextInt()) {
            int num = sc.nextInt();
            countMap.put(num, countMap.getOrDefault(num, 0) + 1);
        }
        for (int key : countMap.keySet()) {
            System.out.println(key + " " + countMap.get(key));
        }
        sc.close();
    }
}
