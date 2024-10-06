package J05014;

public enum MonHoc {
    TOAN('A', 2.0),
    LY('B', 1.5),
    HOA('C', 1.0),
    KHAC('0', 0.0); // KHAC tương ứng với mã '0' và điểm ưu tiên 0.0

    private final char maMonHoc;
    private final double diemUuTien;

    MonHoc(char maMonHoc, double diemUuTien) {
        this.maMonHoc = maMonHoc;
        this.diemUuTien = diemUuTien;
    }

    public char getMaMonHoc() {
        return maMonHoc;
    }

    public double getDiemUuTien() {
        return diemUuTien;
    }

    public static MonHoc fromMaXetTuyen(String maXetTuyen) {
        char mon = maXetTuyen.charAt(0);
        char uuTien = maXetTuyen.charAt(1);

        switch (mon) {
            case 'A': // Toán
                return TOAN;
            case 'B': // Lý
                return LY;
            case 'C': // Hóa
                return HOA;
            case '0': // Không có điểm ưu tiên
                return KHAC;
            default:
                throw new IllegalArgumentException("Mã môn học không hợp lệ: " + mon);
        }
    }

    public static double getDiemUuTien(char uuTien) {
        switch (uuTien) {
            case '1':
                return 2.0;
            case '2':
                return 1.5;
            case '3':
                return 1.0;
            case '4':
            case '0':
                return 0.0;
            default:
                throw new IllegalArgumentException("Mã ưu tiên không hợp lệ: " + uuTien);
        }
    }
}
