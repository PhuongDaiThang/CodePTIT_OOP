package J05010;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        List<Product> products = new ArrayList<>();
        for (int i = 0; i < t; i++) {
            String name = sc.nextLine();
            String type = sc.nextLine();
            double buy = sc.nextDouble();
            double sell = sc.nextDouble();
            sc.nextLine();
            Product p = new Product(i + 1, name, type, buy, sell);
            products.add(p);
        }
        Collections.sort(products);
        for (Product x : products) {
            System.out.println(x);
        }
    }
}
