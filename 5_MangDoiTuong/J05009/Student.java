package J05009;


public class Student implements Comparable<Student> {
    private String msv;
    private String name;
    private String doB;
    private double point1;
    private double point2;
    private double point3;
    private double total;

    public Student(int id, String name, String doB, double point1, double point2, double point3) {
        this.msv = String.format("%01d", id);
        this.name = name;
        this.doB = doB;
        this.point1 = point1;
        this.point2 = point2;
        this.point3 = point3;
        this.total = point1 + point2 + point3;
    }

    public Student() {
        this.name = "";
        this.doB = "";
        this.point1 = 0;
        this.point2 = 0;
        this.point3 = 0;
        this.total = 0;
    }
    public double getTotal() {
        return total;
    }
    public int compareTo(Student e) {
        if (Double.compare(this.total, e.total) != 0) {
            return Double.compare(e.total, this.total);
        } else {
            return this.msv.compareTo(e.msv);
        }
    }
    @Override
    public String toString() {
        return msv + " " + name + " " + doB + " " + " " + String.format("%.1f", total);
    }
}
