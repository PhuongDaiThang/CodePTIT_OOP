import java.util.Scanner;

class Rectangle {
    private int width;
    private int height;
    private String color;

    //constructor
    public Rectangle(int width, int height, String color) {
        this.width = width;
        this.height = height;
        this.color = color;
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    public String getColor() {
        return color;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int findArea() {
        return width * height;
    }

    public int findPerimeter() {
        return 2 * width + 2 * height;
    }
}

public class J04002 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        String color = sc.next();
        color = color.toLowerCase();
        color = String.valueOf(color.charAt(0)).toUpperCase() + color.substring(1);
        Rectangle r = new Rectangle(a, b, color);
        if (r.findArea() > 0 && r.findPerimeter() > 0) {
            System.out.print(r.findPerimeter() + " ");
            System.out.print(r.findArea() + " ");
            System.out.println(r.getColor());
        } else {
            System.out.println("INVALID");
        }
    }
}

