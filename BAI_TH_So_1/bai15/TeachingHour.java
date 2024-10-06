package bai15;

public class TeachingHour {
    private String lecturerCode;
    private String courseCode;
    private double hours;

    public TeachingHour(String lecturerCode, String courseCode, double hours) {
        this.lecturerCode = lecturerCode;
        this.courseCode = courseCode;
        this.hours = hours;
    }

    public String getLecturerCode() {
        return lecturerCode;
    }

    public String getCourseCode() {
        return courseCode;
    }

    public double getHours() {
        return hours;
    }
}