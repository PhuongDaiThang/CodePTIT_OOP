package bai15;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        List<Course> courses = readCourses("MONHOC.in");
        List<Lecturer> lecturers = readLecturers("GIANGVIEN.in");
        List<TeachingHour> teachingHours = readTeachingHours("GIOCHUAN.in");

        Map<String, Lecturer> lecturerMap = new HashMap<>();
        for (Lecturer lecturer : lecturers) {
            lecturerMap.put(lecturer.getLecturerCode(), lecturer);
        }

        for (TeachingHour teachingHour : teachingHours) {
            Lecturer lecturer = lecturerMap.get(teachingHour.getLecturerCode());
            if (lecturer != null) {
                lecturer.addHours(teachingHour.getHours());
            }
        }

        for (Lecturer lecturer : lecturers) {
            System.out.println(lecturer);
        }
    }

    private static List<Course> readCourses(String filePath) throws FileNotFoundException {
        Scanner sc = new Scanner(new File(filePath));
        int numCourses = Integer.parseInt(sc.nextLine().trim());
        List<Course> courses = new ArrayList<>();
        for (int i = 0; i < numCourses; i++) {
            String[] parts = sc.nextLine().split(" ", 2);
            courses.add(new Course(parts[0], parts[1]));
        }
        return courses;
    }

    private static List<Lecturer> readLecturers(String filePath) throws FileNotFoundException {
        Scanner sc = new Scanner(new File(filePath));
        int numLecturers = Integer.parseInt(sc.nextLine().trim());
        List<Lecturer> lecturers = new ArrayList<>();
        for (int i = 0; i < numLecturers; i++) {
            String[] parts = sc.nextLine().split(" ", 2);
            lecturers.add(new Lecturer(parts[0], parts[1]));
        }
        return lecturers;
    }

    private static List<TeachingHour> readTeachingHours(String filePath) throws FileNotFoundException {
        Scanner sc = new Scanner(new File(filePath));
        int numTeachingHours = Integer.parseInt(sc.nextLine().trim());
        List<TeachingHour> teachingHours = new ArrayList<>();
        for (int i = 0; i < numTeachingHours; i++) {
            String[] parts = sc.nextLine().split(" ");
            String lecturerCode = parts[0];
            String courseCode = parts[1];
            double hours = Double.parseDouble(parts[2]);
            teachingHours.add(new TeachingHour(lecturerCode, courseCode, hours));
        }
        return teachingHours;
    }
}