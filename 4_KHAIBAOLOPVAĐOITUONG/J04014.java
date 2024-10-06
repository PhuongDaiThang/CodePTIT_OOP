import java.util.Scanner;

class phanSo {
    private long x;
    private long y;

    public phanSo(long x, long y) {
        this.x = x;
        this.y = y;
    }

    public long getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public long getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void rutGon() {
        long GCD = gcd(this.x, this.y);
        this.x /= GCD;
        this.y /= GCD;
    }

    public phanSo C(phanSo p) {
        long newX = this.x * p.getY() + this.y * p.getX();
        long newY = this.y * p.getY();
        return new phanSo(newX * newX, newY * newY);
    }

    public phanSo D(phanSo p, phanSo p1, phanSo p2) {
        return new phanSo(this.x * p1.getX() * p2.getX(), this.y * p1.getY() * p2.getY());
    }

    public static long gcd(long a, long b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }

    @Override
    public String toString() {
        return x + "/" + y;
    }
}

public class J04014 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            phanSo a = new phanSo(sc.nextInt(), sc.nextInt());
            phanSo b = new phanSo(sc.nextInt(), sc.nextInt());
            phanSo kq1 = a.C(b);
            kq1.rutGon();
            phanSo kq2 = a.D(a, b, kq1);
            kq2.rutGon();
            System.out.println(kq1 + " " + kq2);
        }
    }
}