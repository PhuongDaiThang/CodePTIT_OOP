package J05006;

class Employee {
    private String ma;
    private String fullName;
    private String gender;
    private String dob;
    private String address;
    private String thue;
    private String dayStart;

public Employee(){
    fullName = "";
    gender= "";
    dob = "";
    address = "";
    thue = "";
    dayStart = "";
}

    public Employee(int id, String fullName, String gender, String dob, String thue, String dayStart, String address) {
        this.ma = String.format("%05d", id);
        this.fullName = fullName;
        this.gender = gender;
        this.dob = dob;
        this.address = address;
        this.thue = thue;
        this.dayStart = dayStart;
    }

    @Override
    public String toString() {
        return ma + " " + " " + fullName + " " + gender + " " + dob + " " +address+" "+ thue + " " + dayStart;
    }
}
