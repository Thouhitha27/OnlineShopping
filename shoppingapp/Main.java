import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // User Registration
        System.out.println("===== ONLINE SHOPPING =====");

        System.out.print("Enter Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Email: ");
        String email = sc.nextLine();

        System.out.print("Enter Password: ");
        String password = sc.nextLine();

        User user = new User(name, email, password);

        System.out.println("\nRegistration Successful!");

        // Login
        System.out.println("\n===== LOGIN =====");

        System.out.print("Enter Email: ");
        String loginEmail = sc.nextLine();

        System.out.print("Enter Password: ");
        String loginPassword = sc.nextLine();

        if (user.getEmail().equals(loginEmail)
                && user.getPassword().equals(loginPassword)) {

            System.out.println("Login Successful!");

            // Products
            Product laptop = new Product("Laptop", 50000);
            Product mobile = new Product("Mobile", 20000);
            Product headphone = new Product("Headphone", 2000);

            System.out.println("\n===== PRODUCTS =====");
            System.out.println("1. Laptop - Rs.50000");
            System.out.println("2. Mobile - Rs.20000");
            System.out.println("3. Headphone - Rs.2000");

            System.out.print("\nEnter Product Number: ");
            int choice = sc.nextInt();

            System.out.print("Enter Quantity: ");
            int quantity = sc.nextInt();

            Product selectedProduct = null;

            if (choice == 1) {
                selectedProduct = laptop;
            } else if (choice == 2) {
                selectedProduct = mobile;
            } else if (choice == 3) {
                selectedProduct = headphone;
            } else {
                System.out.println("Invalid Product!");
                sc.close();
                return;
            }

            // Cart
            Cart cart = new Cart();
            cart.addProduct(selectedProduct, quantity);

            cart.displayCart();

            // Order
            Order order = new Order(selectedProduct, quantity);
            order.placeOrder();

            // Payment
            int total = selectedProduct.getPrice() * quantity;

            Payment payment = new Payment(total);
            payment.makePayment();

        } else {
            System.out.println("Invalid Email or Password!");
        }

        sc.close();
    }
}