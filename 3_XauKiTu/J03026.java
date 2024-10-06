import java.util.Scanner;

public class J03026 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while (t-- > 0) {
            String a = sc.nextLine();
            String b = sc.nextLine();
            int max = Math.max(a.length(), b.length());
            if (a.equals(b)) {
                System.out.println("-1");
            } else {
                System.out.println(max);
            }
        }
    }
}
