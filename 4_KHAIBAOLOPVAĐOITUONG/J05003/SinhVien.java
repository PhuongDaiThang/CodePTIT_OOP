package J05003;
import java.text.*;
import java.util.*;

class SinhVien {
    private static int maSvCount = 1;
    private String maSv;
    private String hoTen;
    private String lop;
    private String ngaySinh;
    private double diemGpa;

    public SinhVien() {
        this.maSv = "";
        this.hoTen = "";
        this.lop = "";
        this.ngaySinh = "";
        this.diemGpa = 0.0;
    }

    public void nhapThongTin(Scanner sc) {
        this.hoTen = chuanHoaHoTen(sc.nextLine().trim());
        this.lop = sc.nextLine().trim();
        this.ngaySinh = chuanHoaNgaySinh(sc.nextLine().trim());
        this.diemGpa = Double.parseDouble(sc.nextLine().trim());
        this.maSv = String.format("B20DCCN%03d", maSvCount++);
    }

    private String chuanHoaNgaySinh(String ngaySinh) {
        try {
            SimpleDateFormat originalFormat = new SimpleDateFormat("d/M/yyyy");
            SimpleDateFormat targetFormat = new SimpleDateFormat("dd/MM/yyyy");
            Date date = originalFormat.parse(ngaySinh);
            return targetFormat.format(date);
        } catch (ParseException e) {
            e.printStackTrace();
            return ngaySinh;
        }
    }
    private String chuanHoaHoTen(String hoTen) {
        hoTen = hoTen.trim().toLowerCase();
        String[] words = hoTen.split("\\s+");
        StringBuilder chuanHoa = new StringBuilder();
        for (String word : words) {
            if (!word.isEmpty()) {
                chuanHoa.append(Character.toUpperCase(word.charAt(0)))
                        .append(word.substring(1))
                        .append(" ");
            }
        }
        return chuanHoa.toString().trim();
    }
    public void hienThi() {
        DecimalFormat df = new DecimalFormat("#.00");
        System.out.println(maSv + " " + hoTen + " " + lop + " " + ngaySinh + " " + df.format(diemGpa));
    }
}