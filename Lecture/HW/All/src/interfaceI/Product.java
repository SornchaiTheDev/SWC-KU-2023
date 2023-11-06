/**
 * @ชื่อ นายศรชัย สมสกุล
 * @รหัสนิสิต 6510405814
 */

package interfaceI;

public class Product implements Min, Comparable {
    private String name;
    private double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public double getMin() {
        return getPrice();
    }

    @Override
    public int compareTo(Object other) {
        Product otherProduct = (Product) other;
        return (int) (this.price - otherProduct.price);
    }

}
