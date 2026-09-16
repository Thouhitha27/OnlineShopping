import java.util.ArrayList;

public class Cart {

    ArrayList<Product> products = new ArrayList<>();
    ArrayList<Integer> quantities = new ArrayList<>();

    void addProduct(Product product, int quantity) {
        products.add(product);
        quantities.add(quantity);

        System.out.println(product.name + " added to cart!");
    }

    void displayCart() {

        System.out.println("\n===== CART =====");

        int grandTotal = 0;

        for (int i = 0; i < products.size(); i++) {

            Product product = products.get(i);
            int quantity = quantities.get(i);

            int total = product.price * quantity;

            System.out.println(
                (i + 1) + ". " +
                product.name +
                " | Qty: " + quantity +
                " | Rs." + total
            );

            grandTotal += total;
        }

        System.out.println("------------------");
        System.out.println("Grand Total: Rs." + grandTotal);
    }
}