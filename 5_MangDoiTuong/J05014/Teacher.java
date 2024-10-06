package J05014;

public class Teacher {
    private final String ten;
    private final MonHoc monHoc;
    private final double diemTinHoc;
    private final double diemChuyenMon;
    private final String maGv;

    public Teacher(String maGv, String ten, String maXetTuyen, double diemTinHoc, double diemChuyenMon) {
        this.ten = ten;
        this.monHoc = MonHoc.fromMaXetTuyen(maXetTuyen);
        this.diemTinHoc = diemTinHoc;
        this.diemChuyenMon = diemChuyenMon;
        this.maGv = maGv;
    }

    public String getTen() {
        return ten;
    }

    public MonHoc getMonHoc() {
        return monHoc;
    }

    public double getDiemTinHoc() {
        return diemTinHoc;
    }

    public double getDiemChuyenMon() {
        return diemChuyenMon;
    }

    public String getMaGv() {
        return maGv;
    }

    public double getTongDiem() {
        return (diemTinHoc * 2) + diemChuyenMon + monHoc.getDiemUuTien();
    }

    public String getKetQua() {
        return getTongDiem() >= 18 ? "TRUNG TUYEN" : "LOAI";
    }

    @Override
    public String toString() {
        return String.format("%s %s %s %.1f %s",
                maGv, ten, getMonHoc().name(), getTongDiem(), getKetQua());
    }
}
