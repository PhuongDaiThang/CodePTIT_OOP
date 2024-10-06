import java.util.Scanner;

class Matrix {
    private int n, m;
    private long[][] a;

    public Matrix(int n, int m) {
        a = new long[n][m];
        this.n = n;
        this.m = m;
    }

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }

    public int getM() {
        return m;
    }

    public void setM(int m) {
        this.m = m;
    }

    public void nextMatrix(Scanner sc) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                a[i][j] = sc.nextLong();
            }
        }
    }

    public Matrix mul(Matrix other) {
        Matrix result = new Matrix(this.n, other.m);

        for (int i = 0; i < this.n; i++) {
            for (int j = 0; j < other.m; j++) {
                for (int k = 0; k < this.m; k++) {
                    result.a[i][j] += this.a[i][k] * other.a[k][j];
                }
            }
        }
        return result;
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                sb.append(a[i][j]).append(" ");
            }
            sb.append("\n");
        }
        return sb.toString();
    }
}

public class J04016 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), m = sc.nextInt(), p = sc.nextInt();
        Matrix a = new Matrix(n, m);
        a.nextMatrix(sc);
        Matrix b = new Matrix(m, p);
        b.nextMatrix(sc);
        System.out.println(a.mul(b));
    }
}