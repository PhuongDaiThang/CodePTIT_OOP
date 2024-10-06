package bai10;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

class Student implements Comparable<Student> {
    String name;
    Date startTime;
    Date endTime;
    long onlineDuration;

    public Student(String name, String startTime, String endTime) throws ParseException {
        this.name = name;
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        this.startTime = sdf.parse(startTime);
        this.endTime = sdf.parse(endTime);
        this.onlineDuration = (this.endTime.getTime() - this.startTime.getTime()) / (1000 * 60); 
    }

    @Override
    public int compareTo(Student other) {
        if (this.onlineDuration != other.onlineDuration) {
            return Long.compare(other.onlineDuration, this.onlineDuration);
        }
        return this.name.compareTo(other.name); 
    }

    @Override
    public String toString() {
        return name + " " + onlineDuration;
    }
}
