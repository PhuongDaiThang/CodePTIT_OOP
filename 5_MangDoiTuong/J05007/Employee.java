package J05007;

class Employee implements Comparable<Employee> {
    private String msv;
    private String name;
    private String gender;
    private String dOB;
    private String address;
    private String taxID;
    private String dayStart;

    public Employee(int id, String name, String gender, String dOB, String address, String taxID, String dayStart) {
        this.msv = String.format("%05d", id);
        this.name = name;
        this.gender = gender;
        this.dOB = dOB;
        this.address = address;
        this.taxID = taxID;
        this.dayStart = dayStart;
    }

    public Employee() {
        this.name = "";
        this.gender = "";
        this.dOB = "";
        this.address = "";
        this.taxID = "";
        this.dayStart = "";
    }

    public int compareTo(Employee e) {
        String s1 = this.dOB.substring(this.dOB.length() - 4);
        String s2 = e.dOB.substring(e.dOB.length() - 4);
        return Integer.compare(Integer.parseInt(s1), Integer.parseInt(s2));
    }

    @Override
    public String toString() {
        return msv + " " + name + " " + gender + " " + dOB + " " + address + " " + taxID + " " + dayStart;
    }
}
