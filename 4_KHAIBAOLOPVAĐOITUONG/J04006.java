//import java.text.ParseException;
//import java.text.SimpleDateFormat;
//import java.util.Date;
//import java.util.Scanner;
//
//class Student {
//    private String id = "B20DCCN001";
//    private String name;
//    private String grade;
//    private Date dob;
//    private float gpa;
//
//    public Student() {
//        this.id = "B20DCCN001";
//        this.name = "";
//        this.grade = "";
//        this.dob = new Date();
//        this.gpa = 0;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public String getGrade() {
//        return grade;
//    }
//
//    public void setGrade(String grade) {
//        this.grade = grade;
//    }
//
//    public Date getDob() {
//        return dob;
//    }
//
//    public void setDob(Date dob) {
//        this.dob = dob;
//    }
//
//    public float getGpa() {
//        return gpa;
//    }
//
//    public void setGpa(float gpa) {
//        this.gpa = gpa;
//    }
//
//    private String formatDate(Date date) {
//        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
//        return sdf.format(date);
//    }
//
//    @Override
//    public String toString() {
//        return id + " " + name + " " + grade + " " + formatDate(dob) + " " + String.format("%.2f", gpa);
//    }
//}
//
//public class J04006 {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        Student student = new Student();
//        student.setName(sc.nextLine());
//        student.setGrade(sc.nextLine());
//        String dobInput = sc.nextLine();
//        Date dob = null;
//        try {
//            SimpleDateFormat sdf = new SimpleDateFormat("d/M/yyyy");
//            dob = sdf.parse(dobInput);
//        } catch (ParseException e) {
//            e.printStackTrace();
//            dob = new Date();
//        }
//        student.setDob(dob);
//        float gpa = sc.nextFloat();
//        student.setGpa(gpa);
//        System.out.println(student);
//        sc.close();
//    }
//}
//
