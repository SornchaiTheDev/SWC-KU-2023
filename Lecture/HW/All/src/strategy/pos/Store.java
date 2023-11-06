/**
 *
 * @ชื่อ นายศรชัย สมสกุล
 * @รหัสนิสิต 6510405814
 *
 */

package strategy.pos;

import java.util.ArrayList;
import java.util.List;

public class Store {
    private List<Product> products;

    public Store() {
        products = new ArrayList<>();
    }

    public void addProduct(String name, double price, int quantity) {
        products.add(new Product(name, price, quantity));
    }

    public int countProduct(Counter counter) {
        int total = 0;
        for (Product product : products) {
            total += counter.getAmount(product);
        }
        return total;
    }

}
