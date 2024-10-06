//import java.util.Scanner;
//
//class Point {
//    private double x;
//    private double y;
//
//    //Constructor
//    public Point(double x, double y) {
//        this.x = x;
//        this.y = y;
//    }
//
//    //Getter methods
//    public double getX() {
//        return x;
//    }
//
//    public double getY() {
//        return y;
//    }
//
//    public double distance(Point p) {
//        return Math.sqrt(Math.pow(x - p.getX(), 2) + Math.pow(y - p.getY(), 2));
//    }
//}
//
//public class J04001 {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int t = sc.nextInt();
//        while (t-- > 0) {
//            double x1 = sc.nextDouble();
//            double y1 = sc.nextDouble();
//            double x2 = sc.nextDouble();
//            double y2 = sc.nextDouble();
//
//            Point p1 = new Point(x1, y1);
//            Point p2 = new Point(x2, y2);
//            double distance = p1.distance(p2);
//            System.out.printf("%.4f\n", distance);
//        }
//    }
//}
