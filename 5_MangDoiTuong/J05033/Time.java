class Time implements Comparable<Time> {
    private int hour, minute, second;
    public Time(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    public int getMinute() {
        return minute;
    }

    public void setMinute(int minute) {
        this.minute = minute;
    }

    public int getSecond() {
        return second;
    }

    public void setSecond(int second) {
        this.second = second;
    }
    public int compareTo(Time o) {
        if (this.hour != o.hour) {
            return this.hour - o.hour;
        }
        else if (this.minute != o.minute) {
            return this.minute - o.minute;
        }
        else{
            return this.second - o.second;
        }
    }
    @Override
    public String toString() {
        return  hour + " " + minute + " " + second;
    }
}