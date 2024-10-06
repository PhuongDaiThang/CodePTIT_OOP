package bai13;

import java.io.File;
import java.io.FileNotFoundException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(new File("MUAHANG.in"));
            int numProducts = Integer.parseInt(sc.nextLine().trim());
            Map<String, Product> products = new HashMap<>();
            for (int i = 0; i < numProducts; i++) {
                String productCode = sc.nextLine().trim();
                String productName = sc.nextLine().trim();
                int price = Integer.parseInt(sc.nextLine().trim());
                int warrantyPeriod = Integer.parseInt(sc.nextLine().trim());
                products.put(productCode, new Product(productCode, productName, price, warrantyPeriod));
            }

            int numCustomers = Integer.parseInt(sc.nextLine().trim());
            List<Customer> customers = new ArrayList<>();
            for (int i = 0; i < numCustomers; i++) {
                String customerName = sc.nextLine().trim();
                String address = sc.nextLine().trim();
                String productCode = sc.nextLine().trim();
                int quantity = Integer.parseInt(sc.nextLine().trim());
                String purchaseDate = sc.nextLine().trim();
                Product product = products.get(productCode);
                String customerCode = String.format("KH%02d", i + 1);
                Customer customer = new Customer(customerCode, customerName, address, productCode, quantity, purchaseDate, product.warrantyPeriod, product.price);
                customers.add(customer);
            }
            sc.close();

            Collections.sort(customers);

            for (Customer customer : customers) {
                System.out.println(customer);
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found.");
        } catch (ParseException e) {
            System.out.println("Error parsing date.");
        }
    }
}