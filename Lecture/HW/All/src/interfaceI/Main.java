/**
 *
 * @ชื่อ นายศรชัย สมสกุล
 * @รหัสนิสิต 6510405814
 *
 */

package interfaceI;

public class Main {
    public static void main(String[] args) {
        Product[] products = new Product[4];
        products[0] = new Product("A", 199);
        products[1] = new Product("B", 123);
        products[2] = new Product("C", 50);
        products[3] = new Product("D", 569);
        Car[] cars = new Car[4];
        cars[0] = new Car("A", 100);
        cars[1] = new Car("B", 250);
        cars[2] = new Car("C", 215);
        cars[3] = new Car("D", 112);

        System.out.println(Data.min(products));
        System.out.println(Data.min(cars));
        Data.sort(products);
        for(Product product : products) {
            System.out.print(product.getName() + " ");
        }
        System.out.println();
        Data.sort(cars);
        for(Car car : cars) {
            System.out.print(car.getLicense() + " ");
        }
        System.out.println();
    }
}
