import java.util.Scanner;
import java.util.Arrays;

public class J02005 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] count = new int[1005];
        Arrays.fill(count, 0);
        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();
            count[x] = 1;
        }
        for (int i = 0; i < m; i++) {
            int x = sc.nextInt();
            if (count[x] == 1) {
                count[x]++;
            }
        }
        for (int i = 0; i < 1005; i++) {
            if (count[i] == 2) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }
}