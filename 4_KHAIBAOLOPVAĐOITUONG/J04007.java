import java.util.Scanner;

class Employee{
    private String name;
    private String dateOfBirth;
    private String gender;
    private String address;
    private String taxCode;
    private String signingDate;
    public Employee(){
        this.name="";
        this.gender="";
        this.dateOfBirth="";
        this.address="";
        this.taxCode="";
        this.signingDate="";
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getTaxCode() {
        return taxCode;
    }

    public void setTaxCode(String taxCode) {
        this.taxCode = taxCode;
    }

    public String getSigningDate() {
        return signingDate;
    }

    public void setSigningDate(String signingDate) {
        this.signingDate = signingDate;
    }
    public String toString(){
        return "00001"+" "+name+" "+gender+" "+dateOfBirth+" "+address+" "+taxCode+" "+signingDate;
    }
}
public class J04007 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Employee emp=new Employee();
        emp.setName(sc.nextLine());
        emp.setGender(sc.nextLine());
        emp.setDateOfBirth(sc.nextLine());
        emp.setAddress(sc.nextLine());
        emp.setTaxCode(sc.nextLine());
        emp.setSigningDate(sc.nextLine());
        System.out.println(emp.toString());
    }
}
