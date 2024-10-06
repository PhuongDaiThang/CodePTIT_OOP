import java.util.Scanner;

public class J02008 {
    public static long GCD(long a, long b) {
        if (b == 0) return a;
        return GCD(b, a % b);
    }
    public static long LCM(long a,long b) {
        return (a*b)/GCD(a,b);
    }
    public static long findLCM(int n) {
       long lcm=1;
        for (long i = 1; i <=n; i++) {
            lcm=LCM(lcm,i);
        }
        return lcm;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();

            System.out.println(findLCM(n));
        }
    }
}
