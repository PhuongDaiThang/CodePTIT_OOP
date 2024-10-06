package J07022;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("DATA.in");
        Scanner readFile = new Scanner(file);
        ArrayList<String> list = new ArrayList<String>();
        while (readFile.hasNextLine()) {
            String line = readFile.next();
                try {
                    int n=Integer.parseInt(line);
                } catch (NumberFormatException e) {
                    list.add(line);

                }
            }
        Collections.sort(list);
        for (String part : list) {
            System.out.print(part+" ");
        }
    }
}


