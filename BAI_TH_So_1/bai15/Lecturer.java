package bai15;

public class Lecturer {
    private String lecturerCode;
    private String lecturerName;
    private double totalHours;

    public Lecturer(String lecturerCode, String lecturerName) {
        this.lecturerCode = lecturerCode;
        this.lecturerName = lecturerName;
        this.totalHours = 0.0;
    }

    public void addHours(double hours) {
        this.totalHours += hours;
    }

    public String getLecturerCode() {
        return lecturerCode;
    }

    public String getLecturerName() {
        return lecturerName;
    }

    public double getTotalHours() {
        return totalHours;
    }

    @Override
    public String toString() {
        return lecturerName + " " + String.format("%.2f", totalHours);
    }
}