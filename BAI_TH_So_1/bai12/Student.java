package bai11;

public class Student {
    private final String studentCode;
    private final String name;
    private final String phoneNumber;
    private final String email;

    public Student(String studentCode, String name, String phoneNumber, String email) {
        this.studentCode = studentCode;
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }

    public String studentCode() {
        return studentCode;
    }

    public String name() {
        return name;
    }

    public String phoneNumber() {
        return phoneNumber;
    }

    public String email() {
        return email;
    }
}