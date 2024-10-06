import java.util.Scanner;
import java.util.Arrays;

public class J03005 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            String s = sc.next();

            String[] lines = s.split("\n");

            for (String line : lines) {
                System.out.println(formatName(line.trim()));
            }
        }
    }

    public static String formatName(String name) {
        String[] words = name.trim().split("\\s");
        for (int i = 0; i < words.length; i++) {
            words[i] = words[i].substring(0, 1).toUpperCase() + words[i].substring(1).toLowerCase();
        }
        String lastName = words[0];
        String firstName = String.join(" ", Arrays.copyOfRange(words, 1, words.length));

        return firstName + ", " + lastName;
    }
}
