import java.time.Duration;
import java.time.LocalTime;

public class Employee {
    private String id;
    private String name;
    LocalTime startTime;
    LocalTime endTime;
    public Employee(String id, String name, LocalTime startTime, LocalTime endTime) {
        this.id = id;
        this.name = name;
        this.startTime = startTime;
        this.endTime = endTime;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalTime getStartTime() {
        return startTime;
    }

    public void setStartTime(LocalTime startTime) {
        this.startTime = startTime;
    }

    public LocalTime getEndTime() {
        return endTime;
    }

    public void setEndTime(LocalTime endTime) {
        this.endTime = endTime;
    }
    public long getHour(){
        Duration duration = Duration.between(startTime, endTime);
        return duration.toHours();
    }
    public long getMinute(){
        Duration duration = Duration.between(startTime, endTime);
        return duration.toMinutes()%60;
    }
    public long getTotalMinutes(){
        Duration duration = Duration.between(startTime, endTime);
        return duration.toMinutes();
    }
    @Override
    public String toString() {
        return id+" "+name+" "+getHour()+" gio "+getMinute()+" phut ";
    }
}
