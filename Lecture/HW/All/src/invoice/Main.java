/**
 *
 * @ชื่อ นายศรชัย สมสกุล
 * @รหัสนิสิต 6510405814
 *
 */

package invoice;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Invoice invoice = new Invoice();

        while (true) {
            System.out.println("Menu");
            System.out.println("1. Add Item");
            System.out.println("2. Checkout");
            System.out.println("3. Exit");
            System.out.println("------------------");
            Scanner in = new Scanner(System.in);
            System.out.println("Enter menu :");
            String menuOption = in.nextLine();
            switch (menuOption) {
                case "1": {
                    System.out.println("Item Name : ");
                    String itemName = in.nextLine();
                    System.out.println("Item Price :");
                    double itemPrice = in.nextDouble();
                    System.out.println("Item Quantity : ");
                    int itemQuantity = in.nextInt();
                    invoice.addItem(new Item(itemName, itemQuantity, itemPrice));
                    System.out.printf("Add %s to Cart successfully!\n",itemName);
                    continue;
                }
                case "2": {
                    invoice.printInvoice();
                    break;
                }
                case "3": {
                    break;
                }
            }
            break;

        }
    }
}
