//import java.util.*;
//
//public class Main {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int t = sc.nextInt();
//        sc.nextLine();
//        List<Product> list = new ArrayList<>();
//
//        for (int i = 1; i <= t; i++) {
//            String name = sc.nextLine();
//            String unit = sc.nextLine();
//            long priceBuy = sc.nextLong();
//            long priceSell = sc.nextLong();
//            sc.nextLine();
//            Product product = new Product(i, name, unit, priceBuy, priceSell);
//            list.add(product);
//        }
//
//        Collections.sort(list);
//
//        for (Product product : list) {
//            System.out.println(product);
//        }
//
//    }
//}
