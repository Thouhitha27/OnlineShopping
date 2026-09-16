public class Order {

    Product product;
    int quantity;

    Order(Product product, int quantity) {
        this.product = product;
        this.quantity = quantity;
    }

    void placeOrder() {

        int total = product.price * quantity;

        System.out.println("\n===== ORDER =====");
        System.out.println("Product: " + product.name);
        System.out.println("Quantity: " + quantity);
        System.out.println("Total: Rs." + total);
        System.out.println("Order placed successfully!");
    }
}