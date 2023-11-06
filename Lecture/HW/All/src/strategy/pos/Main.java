/**
 *
 * @ชื่อ นายศรชัย สมสกุล
 * @รหัสนิสิต 6510405814
 *
 */

package strategy.pos;

public class Main {
    public static void main(String[] args) {
        Store store = new Store();
        store.addProduct("Big Java", 300, 5);
        store.addProduct("Da Vinci Code", 120, 0);
        store.addProduct("Python 101", 200, 10);

        System.out.println("In stock: " + store.countProduct(new Instock()));
        System.out.println("All Product: " + store.countProduct(new AllProduct()));
        System.out.println("Product Quantity: " + store.countProduct(new ProductQuantity()));

    }
}
