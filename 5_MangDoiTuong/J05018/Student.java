package J05018;

public class Student implements Comparable<Student> {
    private String idStudent;
    private String name;
    private double avgScore;
    private String rating;
    public Student(int id,String name,double avgScore,String rating) {
        this.idStudent=String.format("HS%02d",id);
        this.name=name;
        this.avgScore=avgScore;
        this.rating=rating;
    }

    public String getIdStudent() {
        return idStudent;
    }

    public void setIdStudent(String idStudent) {
        this.idStudent = idStudent;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getAvgScore() {
        return avgScore;
    }

    public void setAvgScore(double avgScore) {
        this.avgScore = avgScore;
    }

    @Override
    public int compareTo(Student o) {
        if (Double.compare(o.avgScore, this.avgScore) != 0) {
            return Double.compare(o.avgScore, this.avgScore);
        } else {
            return this.idStudent.compareTo(o.idStudent);
        }
    }
    @Override
    public String toString() {
        return idStudent + " " + name + " " + String.format("%.1f", avgScore) + " " + rating;
    }
}
