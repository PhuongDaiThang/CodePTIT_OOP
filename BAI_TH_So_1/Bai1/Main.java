package BAI_TH_So_1.Bai1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        double[] a = new double[t];
        for (int i = 0; i < t; i++) {
            a[i] = sc.nextDouble();
        }
        double kq = Avg(a);
        System.out.printf("%.2f", kq);
    }

    public static double Avg(double[] a) {
        if (a == null || a.length < 3) return 0;
        double max = a[0];
        double min = a[0];
        for (double i : a) {
            if (i > max) {
                max = i;
            }
            if (i < min) {
                min = i;
            }
        }
        double sum = 0;
        int cnt = 0;
        for (double i : a) {
            if (i != max && i != min) {
                sum += i;
                cnt++;
            }
        }
        return cnt > 0 ? sum / cnt : 0;
    }
}