import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try {
            File file = new File("DATA.in");
            Scanner sc = new Scanner(file);
            long sum = 0;
            while (sc.hasNext()) {
                if (sc.hasNextLong()) {
                    long num = sc.nextLong();
                    if (num > Integer.MAX_VALUE && num <= Long.MAX_VALUE) {
                        sum += num;
                    }
                } else {
                    sc.next(); 
                }
            }
            sc.close();
            System.out.println(sum);
        } catch (FileNotFoundException e) {
            System.out.println("File not found.");
        }
    }
}