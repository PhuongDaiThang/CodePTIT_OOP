//import java.util.Scanner;
//class phanSo {
//    private long x;
//    private long y;
//
//    public phanSo(long x, long y) {
//        this.x = x;
//        this.y = y;
//    }
//
//    public long getX() {
//        return x;
//    }
//
//    public long getY() {
//        return y;
//    }
//
//    public void setX(int x) {
//        this.x = x;
//    }
//
//    public void setY(int y) {
//        this.y = y;
//    }
//
//    public void Minimalist() {
//        long GCD=gcd(this.x, this.y);
//        this.x /= GCD;
//        this.y /= GCD;
//    }
//
//    public static long gcd(long a, long b) {
//        if (b == 0) return a;
//        else return gcd(b, a % b);
//    }
//}
//
//public class J04003 {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        long a = sc.nextLong();
//        long b = sc.nextLong();
//        phanSo fraction = new phanSo(a, b);
//        fraction.Minimalist();
//        System.out.println(fraction.getX() + "/" + fraction.getY());
//    }
//}
//
