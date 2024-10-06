import java.util.Scanner;

enum merit{
    GD(250000),
    PGD(200000),
    TP(180000),
    NV(150000);
    private int calc;
    merit(int calc){
        this.calc = calc;
    }
    public int getCalc(){
        return calc;
    }
}
public class J04012 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name=sc.nextLine();
        int salaryBasic=sc.nextInt();
        int day=sc.nextInt();
        sc.nextLine();
        String pos=sc.nextLine();
        int salaryMonth = salaryBasic * day;
        double  bonus=0;
        if(day>=25){
            bonus = 0.2 * salaryMonth;
        }
        else if(day>=22){
            bonus = 0.1 * salaryMonth;
        }
        merit position = merit.valueOf(pos);
        int allowance = position.getCalc();

        int totalIncome = (int) (salaryMonth + bonus + allowance);

        System.out.printf("NV01 %s %d %.0f %d %d%n", name, salaryMonth, bonus, allowance, totalIncome);
    }
}
