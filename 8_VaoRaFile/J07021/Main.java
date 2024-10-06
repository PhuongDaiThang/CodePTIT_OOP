package J07021;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        File file=new File("DATA.in");
        Scanner sc=new Scanner(file);
        while(sc.hasNextLine()){
            String line=sc.nextLine();
            if (line.equals("END")) {
                break;
            }
            System.out.println(chuanHoaHoTen(line));
        }
    }
    private static String chuanHoaHoTen(String hoTen) {
        hoTen = hoTen.trim().toLowerCase();
        String[] words = hoTen.split("\\s+");
        StringBuilder chuanHoa = new StringBuilder();
        for (String word : words) {
            if (!word.isEmpty()) {
                chuanHoa.append(Character.toUpperCase(word.charAt(0)))
                        .append(word.substring(1))
                        .append(" ");
            }
        }
        return chuanHoa.toString().trim();
    }
}
