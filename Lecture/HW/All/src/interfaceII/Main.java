/**
 * @ชื่อ นายศรชัย สมสกุล
 * @รหัสนิสิต 6510405814
 */

package interfaceII;

import java.util.Comparator;

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

        Product minProduct = Data.min(products, new Comparator<Product>() {
            @Override
            public int compare(Product o1, Product o2) {
                return Double.compare(o1.getPrice(), o2.getPrice());
            }
        });

        System.out.println("Minimum product is : " + minProduct.getName() + " - " + minProduct.getPrice());
        Car minCar = Data.min(cars, new Comparator<Car>() {
            @Override
            public int compare(Car o1, Car o2) {
                return Double.compare(o1.getKiloDriven(), o2.getKiloDriven());
            }
        });
        System.out.println("Minimize car is : " + minCar.getLicense() + " - " + minCar.getKiloDriven());
    }
}
