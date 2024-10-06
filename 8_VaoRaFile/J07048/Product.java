package J07048;

public class Product implements Comparable<Product> {
    private String id;
    private String name;
    private String price;
    private int warrity;
    public Product(String id, String name, String price, int warrity) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.warrity = warrity;
    }
    @Override
    public int compareTo(Product o) {
        int giaban= this.price(o.price);
        if(giaban!=0){
            return giaban;
        }
        return this.id.compareTo(o.id);
    }
    @Override
    public String toString(){
        return id+" "+name+" "+price+" "+warrity;
    }
}
