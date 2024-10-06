package J07010;

import java.io.FileNotFoundException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Student {
    private String msv;
    private String name;
    private String grade;
    private String dob;
    private double gpa;

    public Student(int id, String name, String grade, String dob, Double gpa) throws ParseException {
        this.msv = String.format("B20DCCN%03d", id);
        this.name = name;
        this.grade = grade;
        DateFormat date = new SimpleDateFormat("dd/MM/yyyy");
        this.dob = date.format(date.parse(dob));
        this.gpa = gpa;
    }

    @Override
    public String toString() {
        return msv + " " + name + " " + grade + " " + dob + " " + String.format("%.2f", gpa);
    }
}

