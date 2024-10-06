import java.util.Scanner;
enum position{
    HT(2000000),
    HP(900000),
    GV(500000);
    private int allowance;
    position(int allowance){
        this.allowance = allowance;
    }
    public int getAllowance(){
        return allowance;
    }
}

public class J04015 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String hs = sc.nextLine().trim();
        String name = sc.nextLine().trim();
        int salaryBasic = sc.nextInt();
        String pst = hs.substring(0, 2);
        int hsl = Integer.parseInt(hs.substring(2));
        position pos = position.valueOf(pst);
        int phucap = pos.getAllowance();
        int thunhap = (salaryBasic * hsl) + phucap;
        System.out.printf("%s %s %d %d %d%n", hs, name, hsl, phucap, thunhap);
    }
}