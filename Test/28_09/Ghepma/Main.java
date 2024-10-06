package Ghepma;

import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        try {
            ArrayList<String> data1 = readData1("DATA1.in");
            ArrayList<Integer> data2 = readData2("DATA2.in");

            TreeSet<String> unc = generate(data1, data2);

            for (String x : unc) {
                System.out.println(x);
            }
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    private static ArrayList<String> readData1(String filename) throws IOException, ClassNotFoundException {
        FileInputStream fis = new FileInputStream(filename);
        ObjectInputStream ois = new ObjectInputStream(fis);
        ArrayList<String> data = (ArrayList<String>) ois.readObject();
        ois.close();
        return data;
    }

    private static ArrayList<Integer> readData2(String filename) throws IOException, ClassNotFoundException {
        FileInputStream fis = new FileInputStream(filename);
        ObjectInputStream ois = new ObjectInputStream(fis);
        ArrayList<Integer> data = (ArrayList<Integer>) ois.readObject();
        ois.close();
        return data;
    }

    private static TreeSet<String> generate(ArrayList<String> data1, ArrayList<Integer> data2) {
        TreeSet<String> unc = new TreeSet<>();
        for (String str : data1) {
            for (Integer num : data2) {
                unc.add(str + String.format("%03d", num));
            }
        }
        return unc;
    }
}
