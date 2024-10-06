package J03025;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while (t-- > 0) {
            String s = sc.nextLine();
            int dem = 0;
            for (int i = 0; i < s.length() / 2; i++) {
                if (s.charAt(i) != s.charAt(s.length() - i - 1)) {
                    dem++;
                }
            }
            if ((s.length() % 2 == 0 && dem == 1) || (s.length() % 2 == 1 && dem <= 1)) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}
