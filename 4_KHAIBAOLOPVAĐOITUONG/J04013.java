import java.util.Scanner;

enum Enrollment{
    KV1(0.5),
    KV2(1.0),
    KV3(2.5);
    private double calc;
    Enrollment(double calc){
        this.calc = calc;
    }
    public double getCalc(){
        return calc;
    }
}
public class J04013 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String id=sc.nextLine();
        String name=sc.nextLine();
        double mathsScores=sc.nextDouble();
        double physicsScores=sc.nextDouble();
        double chemistryScores=sc.nextDouble();
        double total=2*mathsScores + physicsScores + chemistryScores;
        String kq;
        String x;
        int sum=(int)total;
        if(sum==total){
            kq= String.valueOf(sum);
        }
        else{
            kq=String.valueOf(total);
        }
        String ut=id.substring(0,3);
        Enrollment en=Enrollment.valueOf(ut);
        double finalScore=total+en.getCalc();
        int y=(int)en.getCalc();
        if(y==en.getCalc()){
            x= String.valueOf(y);
        }
        else{
            x=String.valueOf(en.getCalc());
        }
        String status=finalScore>=24?"TRUNG TUYEN":"TRUOT";
        System.out.println(id+" "+name+" "+x+" "+kq+" "+status);
    }
}
