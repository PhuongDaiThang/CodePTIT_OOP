package J05021;

public class Grade implements Comparable<Grade> {
    private String msv;
    private String name;
    private String grade;
    private String email;

    public Grade(String msv, String name, String grade, String email) {
        this.msv = msv;
        this.name = name;
        this.grade = grade;
        this.email = email;
    }

    public String getMsv() {
        return msv;
    }

    public void setMsv(String msv) {
        this.msv = msv;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public int compareTo(Grade o) {
        int masv = this.msv.compareTo(o.msv);
        if (masv != 0) {
            return masv;
        }
        return this.grade.compareTo(o.grade);
    }

    @Override
    public String toString() {
        return msv + " " + name + " " + grade + " " + email;
    }
}
