package bai11;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        List<Student> students = readStudents("SINHVIEN.in");
        List<Project> projects = readProjects("DETAI.in");
        List<Assignment> assignments = readAssignments("HOIDONG.in");

        Map<String, Student> studentMap = new HashMap<>();
        for (Student student : students) {
            studentMap.put(student.studentCode(), student);
        }

        Map<String, Project> projectMap = new HashMap<>();
        for (Project project : projects) {
            projectMap.put(project.projectCode(), project);
        }

        Map<String, List<Assignment>> councilMap = new HashMap<>();
        for (Assignment assignment : assignments) {
            councilMap.computeIfAbsent(assignment.councilCode(), k -> new ArrayList<>()).add(assignment);
        }

        for (int i = 1; i <= 8; i++) {
            String councilCode = "HD" + i;
            List<Assignment> councilAssignments = councilMap.getOrDefault(councilCode, new ArrayList<>());
            councilAssignments.sort(Comparator.comparing(Assignment::studentCode));

            if (!councilAssignments.isEmpty()) {
                System.out.println("DANH SACH HOI DONG " + i + ":");
                for (Assignment assignment : councilAssignments) {
                    Student student = studentMap.get(assignment.studentCode());
                    Project project = projectMap.get(assignment.projectCode());
                    System.out.println(student.studentCode() + " " + student.name() + " " + project.projectTitle() + " " + project.lecturerName());
                }
                System.out.println();
            }
        }
    }

    private static List<Student> readStudents(String filePath) throws FileNotFoundException {
        Scanner sc = new Scanner(new File(filePath));
        int numStudents = Integer.parseInt(sc.nextLine().trim());
        List<Student> students = new ArrayList<>();
        for (int i = 0; i < numStudents; i++) {
            String studentCode = sc.nextLine().trim();
            String name = sc.nextLine().trim();
            String phoneNumber = sc.nextLine().trim();
            String email = sc.nextLine().trim();
            students.add(new Student(studentCode, name, phoneNumber, email));
        }
        return students;
    }

    private static List<Project> readProjects(String filePath) throws FileNotFoundException {
        Scanner sc = new Scanner(new File(filePath));
        int numProjects = Integer.parseInt(sc.nextLine().trim());
        List<Project> projects = new ArrayList<>();
        for (int i = 0; i < numProjects; i++) {
            String lecturerName = sc.nextLine().trim();
            String projectTitle = sc.nextLine().trim();
            String projectCode = String.format("DT%03d", i + 1);
            projects.add(new Project(projectCode, lecturerName, projectTitle));
        }
        return projects;
    }

    private static List<Assignment> readAssignments(String filePath) throws FileNotFoundException {
        Scanner sc = new Scanner(new File(filePath));
        int numAssignments = Integer.parseInt(sc.nextLine().trim());
        List<Assignment> assignments = new ArrayList<>();
        for (int i = 0; i < numAssignments; i++) {
            StringTokenizer st = new StringTokenizer(sc.nextLine());
            String studentCode = st.nextToken();
            String projectCode = st.nextToken();
            String councilCode = st.nextToken();
            assignments.add(new Assignment(studentCode, projectCode, councilCode));
        }
        return assignments;
    }
}