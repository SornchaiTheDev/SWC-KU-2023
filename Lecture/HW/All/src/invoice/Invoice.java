/**
 *
 * @ชื่อ นายศรชัย สมสกุล
 * @รหัสนิสิต 6510405814
 *
 */

package invoice;

import java.util.ArrayList;

public class Invoice {

    ArrayList<Item> items;

    public Invoice() {
        items = new ArrayList<>();
    }

    public void addItem(Item item) {
        items.add(item);
    }

    public double calculateTotalPrice() {
        double totalPrice = 0;
        for (Item item : items) {
            totalPrice += item.getSubTotalPrice();
        }
        return totalPrice;
    }

    public void printInvoice() {
        System.out.println("              INVOICE");
        System.out.println("Sam's Small Appliances");
        System.out.println("100 Main Street");
        System.out.println("Anytown, CA 98765\n");

        System.out.printf("%-20s %-10s %-9s %3s\n","Description","Price","Qty","Subtotal");
        for (Item item : items) {
            String formattedString = String.format(" %-20s %-10.2f %-9d %.2f", item.getName(), item.getPrice(), item.getQuantity(), item.getSubTotalPrice());
            System.out.println(formattedString);
        }

        System.out.printf("\nTOTAL TO PAY:  $ %,.2f",calculateTotalPrice());
    }
}
