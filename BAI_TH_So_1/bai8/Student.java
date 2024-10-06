package bai8;

class Student implements Comparable<Student> {
    private String idStudent;
    private String name;
    private String grade;
    private String email;
    private String phoneNumber;
    public Student(String idStudent, String name, String grade, String email, String phoneNumber) {
        this.idStudent = idStudent;
        this.name = name;
        this.grade = grade;
        this.email = email;
        this.phoneNumber = phoneNumber;
        }
        @Override
    public int compareTo(Student other) {
        if (this.grade.equals(other.grade)) {
            return this.idStudent.compareTo(other.idStudent);
        }
        return this.grade.compareTo(other.grade);
    }
        @Override
        public String toString() {
        return idStudent + " " + name + " " + grade + " " + email + " " + "0"+phoneNumber;
    }
}
