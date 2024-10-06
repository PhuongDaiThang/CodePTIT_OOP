package J05014;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int soGv = Integer.parseInt(scanner.nextLine().trim());
        List<Teacher> danhSachGv = new ArrayList<>();

        for (int i = 0; i < soGv; i++) {
            String ten = scanner.nextLine().trim();
            String maXetTuyen = scanner.nextLine().trim();
            double diemTinHoc = Double.parseDouble(scanner.nextLine().trim());
            double diemChuyenMon = Double.parseDouble(scanner.nextLine().trim());

            String maGv = String.format("GV%02d", i + 1);
            Teacher gv = new Teacher(maGv, ten, maXetTuyen, diemTinHoc, diemChuyenMon);
            danhSachGv.add(gv);
        }

        // Sắp xếp danh sách theo tổng điểm giảm dần, nếu bằng nhau thì sắp xếp theo mã giáo viên tăng dần
        Collections.sort(danhSachGv, new Comparator<Teacher>() {
            @Override
            public int compare(Teacher gv1, Teacher gv2) {
                int soSanhTongDiem = Double.compare(gv2.getTongDiem(), gv1.getTongDiem());
                if (soSanhTongDiem == 0) {
                    return gv1.getMaGv().compareTo(gv2.getMaGv());
                }
                return soSanhTongDiem;
            }
        });

        // In kết quả
        for (Teacher gv : danhSachGv) {
            System.out.println(gv);
        }
    }
}
