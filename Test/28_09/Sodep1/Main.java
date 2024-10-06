package Sodep1;
import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        try {
            ArrayList<Integer> data1 = readData("DATA1.in");
            ArrayList<Integer> data2 = readData("DATA2.in");

            HashMap<Integer, Integer> countMap1 = countBeautifulNumbers(data1);
            HashMap<Integer, Integer> countMap2 = countBeautifulNumbers(data2);

            TreeSet<Integer> commonBeautifulNumbers = new TreeSet<>(countMap1.keySet());
            commonBeautifulNumbers.retainAll(countMap2.keySet());

            for (Integer num : commonBeautifulNumbers) {
                System.out.println(num + " " + countMap1.get(num) + " " + countMap2.get(num));
            }
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    private static ArrayList<Integer> readData(String filename) throws IOException, ClassNotFoundException {
        FileInputStream fis = new FileInputStream(filename);
        ObjectInputStream ois = new ObjectInputStream(fis);
        ArrayList<Integer> data = (ArrayList<Integer>) ois.readObject();
        ois.close();
        return data;
    }

    private static HashMap<Integer, Integer> countBeautifulNumbers(ArrayList<Integer> data) {
        HashMap<Integer, Integer> countMap = new HashMap<>();
        for (Integer num : data) {
            if (isBeautiful(num)) {
                countMap.put(num, countMap.getOrDefault(num, 0) + 1);
            }
        }
        return countMap;
    }

    private static boolean isBeautiful(int num) {
        String str = String.valueOf(num);
        for (int i = 0; i < str.length() - 1; i++) {
            if (str.charAt(i) > str.charAt(i + 1)) {
                return false;
            }
        }
        return true;
    }
}
