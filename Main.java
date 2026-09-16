import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // User Registration
        System.out.println("===== REGISTER =====");

        System.out.print("Enter Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Email: ");
        String email = sc.nextLine();

        System.out.print("Enter Password: ");
        String password = sc.nextLine();

        User user = new User(name, email, password);

        System.out.println("\nRegistration successful!");

        // Login
        System.out.println("\n===== LOGIN =====");

        System.out.print("Enter Email: ");
        String loginEmail = sc.nextLine();

        System.out.print("Enter Password: ");
        String loginPassword = sc.nextLine();

        if (loginEmail.equals(user.email) &&
            loginPassword.equals(user.password)) {

            System.out.println("\nLogin successful!");

            // Products
            Product laptop = new Product("Laptop", 50000);
            Product mobile = new Product("Mobile", 20000);
            Product headphone = new Product("Headphone", 2000);

            System.out.println("\n===== PRODUCTS =====");
            System.out.println("1. Laptop - Rs.50000");
            System.out.println("2. Mobile - Rs.20000");
            System.out.println("3. Headphone - Rs.2000");

            System.out.print("Enter product number: ");
            int choice = sc.nextInt();

            Product selectedProduct = null;

            if (choice == 1) {
                selectedProduct = laptop;
            } 
            else if (choice == 2) {
                selectedProduct = mobile;
            } 
            else if (choice == 3) {
                selectedProduct = headphone;
            } 
            else {
                System.out.println("Invalid product!");
            }

            if (selectedProduct != null) {

                System.out.print("Enter quantity: ");
                int quantity = sc.nextInt();

                if (quantity > 0) {

                    // Cart
                    Cart cart = new Cart();
                    cart.addProduct(selectedProduct, quantity);
                    cart.displayCart();

                    // Order
                    Order order = new Order(selectedProduct, quantity);
                    order.placeOrder();

                    // Payment
                    int total = selectedProduct.price * quantity;

                    Payment payment = new Payment(total);
                    payment.makePayment();

                } 
                else {
                    System.out.println("Invalid quantity!");
                }
            }

        } 
        else {

            System.out.println("\nInvalid email or password!");
        }

        sc.close();
    }
}