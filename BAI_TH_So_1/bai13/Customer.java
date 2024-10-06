package bai13;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Customer implements Comparable<Customer> {
    private String customerCode;
    private String customerName;
    private String address;
    private String productCode;
    private int quantity;
    private Date purchaseDate;
    private Date warrantyEndDate;
    private int totalPrice;

    public Customer(String customerCode, String customerName, String address, String productCode, int quantity, String purchaseDate, int warrantyPeriod, int price) throws ParseException {
        this.customerCode = customerCode;
        this.customerName = customerName;
        this.address = address;
        this.productCode = productCode;
        this.quantity = quantity;
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        this.purchaseDate = sdf.parse(purchaseDate);
        Calendar cal = Calendar.getInstance();
        cal.setTime(this.purchaseDate);
        cal.add(Calendar.MONTH, warrantyPeriod);
        this.warrantyEndDate = cal.getTime();
        this.totalPrice = quantity * price;
    }

    @Override
    public int compareTo(Customer other) {
        if (!this.warrantyEndDate.equals(other.warrantyEndDate)) {
            return this.warrantyEndDate.compareTo(other.warrantyEndDate); 
        }
        return this.customerCode.compareTo(other.customerCode);
    }

    @Override
    public String toString() {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        return customerCode + " " + customerName + " " + address + " " + productCode + " " + totalPrice + " " + sdf.format(warrantyEndDate);
    }
}