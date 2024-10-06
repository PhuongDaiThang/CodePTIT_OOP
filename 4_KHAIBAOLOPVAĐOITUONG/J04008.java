//import java.util.Scanner;
//
//class Point {
//    private double x;
//    private double y;
//
//    public Point() {
//        this.x = x;
//        this.y = y;
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
//
//    public double distance(Point p) {
//        double dx = x - p.getX();
//        double dy = y - p.getY();
//        double dis = Math.sqrt(dx * dx + dy * dy);
//        return dis;
//    }
//}
//
//class Triangle {
//    private Point A = new Point(), B = new Point(), C = new Point();
//    private double AB, AC, BC;
//
//    public Triangle(double x1, double y1, double x2, double y2, double x3, double y3) {
//        A.setX(x1);
//        A.setY(y1);
//        B.setX(x2);
//        B.setY(y2);
//        C.setX(x3);
//        C.setY(y3);
//        this.AB = A.distance(B);
//        this.AC = A.distance(C);
//        this.BC = B.distance(C);
//    }
//
//    @Override
//    public String toString() {
//        if (AB + BC <= AC || AC + BC <= AB || AB + AC <= BC)
//            return String.format("INVALID");
//        return String.format("%.3f", AB + BC + AC);
//    }
//
//}
//
//public class J04008 {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int t = sc.nextInt();
//        while (t-- > 0) {
//            Triangle tr = new Triangle(sc.nextDouble(), sc.nextDouble(), sc.nextDouble(), sc.nextDouble(), sc.nextDouble(), sc.nextDouble());
//            System.out.println(tr);
//        }
//    }
//}
