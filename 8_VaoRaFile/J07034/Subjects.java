package J07034;


public class Subjects implements Comparable<Subjects> {
    private String id;
    private String name;
    private int credit;
    public Subjects(String id, String name, int credit) {
        this.id = id;
        this.name = name;
        this.credit = credit;
    }
    @Override
    public int compareTo(Subjects o) {
        int msv=this.name.compareTo(o.name);
            return msv;
    }
    @Override
    public String toString() {
        return  id + " " + name + " " + credit;
    }
}
