package J07005;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {
        String fileName = "DATA.IN";

        Map<Integer, Integer> numberCount = new TreeMap<>();

        try (FileInputStream fis = new FileInputStream(fileName);
             DataInputStream dis = new DataInputStream(fis)) {

            for (int i = 0; i < 100000; i++) {
                int number = dis.readInt();
                if (number < 1000) {
                    numberCount.put(number, numberCount.getOrDefault(number, 0) + 1);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        for (Map.Entry<Integer, Integer> entry : numberCount.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }
}
