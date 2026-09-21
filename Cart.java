import java.util.ArrayList;

public class Cart {

    ArrayList<Product> products = new ArrayList<>();
    ArrayList<Integer> quantities = new ArrayList<>();

    // Add product
    public void addProduct(Product product, int quantity) {

        for (int i = 0; i < products.size(); i++) {

            if (products.get(i).getName().equals(product.getName())) {

                quantities.set(i, quantities.get(i) + quantity);

                System.out.println(product.getName() + " quantity updated!");
                return;
            }
        }

        products.add(product);
        quantities.add(quantity);

        System.out.println(product.getName() + " added to cart!");
    }

    // Display cart
    public void displayCart() {

        System.out.println("\n===== CART =====");

        if (products.size() == 0) {
            System.out.println("Cart is empty!");
            return;
        }

        int grandTotal = 0;

        for (int i = 0; i < products.size(); i++) {

            Product product = products.get(i);
            int quantity = quantities.get(i);

            int total = product.getPrice() * quantity;

            System.out.println(
                (i + 1) + ". " +
                product.getName() +
                " | Qty: " + quantity +
                " | Rs." + total
            );

            grandTotal += total;
        }

        System.out.println("------------------");
        System.out.println("Grand Total: Rs." + grandTotal);
    }

    // Remove product
    public void removeProduct(int productNumber) {

        if (productNumber >= 1 && productNumber <= products.size()) {

            String name = products.get(productNumber - 1).getName();

            products.remove(productNumber - 1);
            quantities.remove(productNumber - 1);

            System.out.println(name + " removed from cart!");

        } else {

            System.out.println("Invalid product number!");
        }
    }
}