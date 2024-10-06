//import java.util.Scanner;
//
//class Point{
//    private double x;
//    private double y;
//    public Point(){
//        this.x=x;
//        this.y=y;
//    }
//
//    public double getX() {
//        return x;
//    }
//
//    public void setX(double x) {
//        this.x = x;
//    }
//
//    public double getY() {
//        return y;
//    }
//
//    public void setY(double y) {
//        this.y = y;
//    }
//    public double distance(Point p){
//        double dx=x-p.getX();
//        double dy=-p.getY()+y;
//        return Math.sqrt(dx*dx+dy*dy);
//    }
//}
//class Triangle{
//    private Point A=new Point(),B=new Point(),C=new Point();
//    private double AB,AC,BC;
//    public Triangle(double x1, double y1, double x2, double y2, double x3, double y3){
//        A.setX(x1);
//        A.setY(y1);
//        B.setX(x2);
//        B.setY(y2);
//        C.setX(x3);
//        C.setY(y3);
//        this.AB=A.distance(B);
//        this.AC=A.distance(C);
//        this.BC=B.distance(C);
//    }
//    @Override
//    public String toString() {
//        if(AB+AC<=BC||AC+BC<=AB||BC+AB<=AC){
//            return String.format("INVALID");
//        }
//        return String.format("%.2f",0.25*Math.sqrt((AB+AC+BC)*(AB+AC-BC)*(AB-AC+BC)*(-AB+AC+BC)));
//    }
//}
//public class J04009 {
//    public static void main(String[] args) {
//        Scanner sc=new Scanner(System.in);
//        int t=sc.nextInt();
//        while(t-->0){
//            Triangle tre=new Triangle(sc.nextDouble(),sc.nextDouble(),sc.nextDouble(),sc.nextDouble(),sc.nextDouble(),sc.nextDouble());
//            System.out.println(tre);
//        }
//    }
//}
