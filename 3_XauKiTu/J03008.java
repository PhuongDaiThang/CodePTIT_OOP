import java.util.Arrays;
import java.util.Scanner;

public class J03008 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            String s = sc.next();
            if (tn(s) && nt(s)) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }

    private static boolean tn(String s) {
        String rev = new StringBuilder(s).reverse().toString();
        return rev.equals(s);
    }

    private static boolean nt(String s) {
        return s.chars()
                .mapToObj(c -> (char) c)
                .allMatch(c -> Arrays.asList('2', '3', '5', '7').contains(c));
    }
}
