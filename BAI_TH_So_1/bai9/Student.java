package bai9;

class Student implements Comparable<Student> {
    private String name;
    private int numCorrect;
    private int numSubmissions;

    public Student(String name, int numCorrect, int numSubmissions) {
        this.name = name;
        this.numCorrect = numCorrect;
        this.numSubmissions = numSubmissions;
    }

    @Override
    public int compareTo(Student other) {
        if (this.numCorrect != other.numCorrect) {
            return Integer.compare(other.numCorrect, this.numCorrect); 
        }
        if (this.numSubmissions != other.numSubmissions) {
            return Integer.compare(this.numSubmissions, other.numSubmissions);
        }
        return this.name.compareTo(other.name); 
    }

    @Override
    public String toString() {
        return name + " " + numCorrect + " " + numSubmissions;
    }
}
