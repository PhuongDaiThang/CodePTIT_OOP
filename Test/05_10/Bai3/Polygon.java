package Bai3;

public class Polygon {
    private Point[] points;

    public Polygon(Point[] points) {
        this.points = points;
    }

    public String getArea() {
        int n = points.length;
        double area;
        for (int i = 0; i < n; i++) {
            int j = (i + 1) % n;
            area += points[i].getX() * points[j].getY();
            area -= points[j].getX() * points[i].getY();
        }
        area = Math.abs(area) / 2.0;
        return String.format("%.3f",area);
    }
}