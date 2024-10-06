package J07037;

public class Company implements Comparable<Company>{
    private String id;
    private String name;
    private int number;
    public  Company(String id, String name, int number) {
        this.id = id;
        this.name = name;
        this.number = number;
    }
    @Override
    public int compareTo(Company o) {
        int idCompany=this.id.compareTo(o.id);
        return idCompany;
    }
    @Override
    public String toString() {
        return id+" "+name+" "+number;
    }
}
