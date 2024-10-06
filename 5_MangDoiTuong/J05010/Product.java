package J05010;

public class Product implements Comparable<Product> {
    private String idProduct;
    private String name;
    private String type;
    private double buy;
    private double sell;
    private double profit;

    public Product(int id, String name, String type, double buy, double sell) {
        this.idProduct = String.format("%01d", id);
        this.name = name;
        this.type = type;
        this.buy = buy;
        this.sell = sell;
        this.profit = sell - buy;
    }

    public String getIdProduct() {
        return idProduct;
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public double getBuy() {
        return buy;
    }

    public double getSell() {
        return sell;
    }

    public double getProfit() {
        return profit;
    }

    @Override
    public int compareTo(Product e) {
        if (Double.compare(e.profit, this.profit) != 0) {
            return Double.compare(e.profit, this.profit);
        } else {
            return this.idProduct.compareTo(e.idProduct);
        }
    }

    @Override
    public String toString() {
        return idProduct + " " + name + " " + type + " " + String.format("%.2f", profit); // Hiển thị thông tin sản phẩm
    }
}
