package bai11;

public class Project {
    private final String projectCode;
    private final String lecturerName;
    private final String projectTitle;

    public Project(String projectCode, String lecturerName, String projectTitle) {
        this.projectCode = projectCode;
        this.lecturerName = lecturerName;
        this.projectTitle = projectTitle;
    }

    public String projectCode() {
        return projectCode;
    }

    public String lecturerName() {
        return lecturerName;
    }

    public String projectTitle() {
        return projectTitle;
    }
}