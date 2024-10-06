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
//        return Math.sqrt(Math.pow(this.x - p.x, 2) + Math.pow(this.y - p.y, 2));
//    }
//}
//
//class Triangle {
//    private Point a = new Point(), b = new Point(), c = new Point();
//    private double AB, AC, BC;
//
//    public Triangle(double x1, double y1, double x2, double y2, double x3, double y3) {
//        a.setX(x1);
//        a.setY(y1);
//        b.setX(x2);
//        b.setY(y2);
//        c.setX(x3);
//        c.setY(y3);
//        AB = a.distance(b);
//        AC = a.distance(c);
//        BC = b.distance(c);
//    }
//
//    @Override
//    public String toString() {
//        if (AB + AC <= BC || AC + BC <= AB || BC + AB <= AC) {
//            return String.format("INVALID");
//        }
//        double s = 0.25 * Math.sqrt((AB + AC + BC) * (AB + AC - BC) * (AB - AC + BC) * (-AB + AC + BC));
//        return String.format("%.3f", ((AB * AC * BC) / (4 * s))*((AB * AC * BC) / (4 * s))*Math.PI);
//    }
//}
//
//public class J04010 {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int t = sc.nextInt();
//        while (t-- > 0) {
//            Triangle test = new Triangle(sc.nextDouble(),sc.nextDouble(),sc.nextDouble(),sc.nextDouble(),sc.nextDouble(),sc.nextDouble());
//            System.out.println(test);
//        }
//    }
//}
