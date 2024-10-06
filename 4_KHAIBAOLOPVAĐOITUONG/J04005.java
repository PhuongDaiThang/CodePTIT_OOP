import java.util.Scanner;

class Student {
    private String name;
    private String doB;
    private double subject1;
    private double subject2;
    private double subject3;

    public Student() {
        this.name = "";
        this.doB = "";
        this.subject1 = 0;
        this.subject2 = 0;
        this.subject3 = 0;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDoB() {
        return doB;
    }

    public void setDoB(String doB) {
        this.doB = doB;
    }

    public double getSubject1() {
        return subject1;
    }

    public void setSubject1(double subject1) {
        this.subject1 = subject1;
    }

    public double getSubject2() {
        return subject2;
    }

    public void setSubject2(double subject2) {
        this.subject2 = subject2;
    }

    public double getSubject3() {
        return subject3;
    }

    public void setSubject3(double subject3) {
        this.subject3 = subject3;
    }

    public double sumPoint() {
        return this.subject1 + this.subject2 + this.subject3;
    }
}

public class J04005 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s=sc.nextLine();
        Student s1 = new Student();
        s1.setName(s);
        s = sc.nextLine();
        s1.setDoB(s);
        double x=sc.nextDouble();
        s1.setSubject1(x);
        x = sc.nextDouble();
        s1.setSubject2(x);
        x = sc.nextDouble();
        s1.setSubject3(x);
        System.out.printf("%s %s %.1f",s1.getName(),s1.getDoB(),s1.sumPoint());
    }
}
