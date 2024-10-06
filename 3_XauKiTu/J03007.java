import java.util.Scanner;

public class J03007 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            String s = sc.next();
            if (tn(s) && kt(s) && tong(s) % 10 == 0) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }

    private static int tong(String s) {
        int tong = 0;
        for (int i = 0; i < s.length(); i++) {
            tong += s.charAt(i) - '0';
        }
        return tong;
    }

    private static boolean kt(String s) {
        return s.endsWith("8") && s.startsWith("8");
    }

    private static boolean tn(String s) {
        String rev = new StringBuilder(s).reverse().toString();
        return rev.equals(s);
    }
}
