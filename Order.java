public class Order {

    Product product;
    int quantity;

    public Order(Product product, int quantity) {
        this.product = product;
        this.quantity = quantity;
    }

    public void placeOrder() {

        int total = product.getPrice() * quantity;

        System.out.println("\n===== ORDER =====");
        System.out.println("Product: " + product.getName());
        System.out.println("Quantity: " + quantity);
        System.out.println("Total: Rs." + total);
        System.out.println("Order placed successfully!");
    }
}