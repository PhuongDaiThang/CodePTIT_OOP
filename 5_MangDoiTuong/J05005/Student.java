package J05005;

import java.text.SimpleDateFormat;
import java.util.Date;

class Student implements Comparable<Student> {

    private String msv;
    private String fullName;
    private String grade;
    private Date birthday;
    float gpa;

    public Student(int id, String fullName, String grade, Date birthday, float gpa) {
        this.msv = String.format("B20DCCN%03d", id);
        this.fullName = fullName;
        this.grade = grade;
        this.birthday = birthday;
        this.gpa = gpa;
    }

    public void chuanhoa() {
        String[] words = fullName.trim().toLowerCase().split("\\s+");
        StringBuilder builder = new StringBuilder();
        for (String word : words) {
            builder.append(Character.toUpperCase(word.charAt(0)));
            builder.append(word.substring(1));
            builder.append(" ");
        }
        fullName = builder.toString().trim();
    }

    @Override
    public int compareTo(Student o) {
        if (Float.compare(this.gpa, o.gpa) != 0) {
            return Float.compare(o.gpa, this.gpa);
        } else {
            return this.msv.compareTo(o.msv);
        }
    }

    @Override
    public String toString() {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        return msv + " " + fullName + " " + grade + " " + dateFormat.format(birthday) + " "
                + String.format("%.2f", gpa);
    }
}
