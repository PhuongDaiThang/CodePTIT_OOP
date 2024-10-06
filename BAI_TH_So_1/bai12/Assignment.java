package bai11;

public class Assignment {
    private final String studentCode;
    private final String projectCode;
    private final String councilCode;

    public Assignment(String studentCode, String projectCode, String councilCode) {
        this.studentCode = studentCode;
        this.projectCode = projectCode;
        this.councilCode = councilCode;
    }

    public String studentCode() {
        return studentCode;
    }

    public String projectCode() {
        return projectCode;
    }

    public String councilCode() {
        return councilCode;
    }
}