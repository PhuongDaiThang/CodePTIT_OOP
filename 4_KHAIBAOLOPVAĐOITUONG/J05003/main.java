package J05003;

import java.util.ArrayList;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.nextLine().trim());

        ArrayList<SinhVien> danhSachSinhVien = new ArrayList<>();

        for (int i = 0; i < N; i++) {
            SinhVien sv = new SinhVien();
            sv.nhapThongTin(sc);
            danhSachSinhVien.add(sv);
        }

        for (SinhVien sv : danhSachSinhVien) {
            sv.hienThi();
        }
        sc.close();
    }
}
