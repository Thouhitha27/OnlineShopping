public class Payment {

    int amount;

    public Payment(int amount) {
        this.amount = amount;
    }

    public void makePayment() {

        System.out.println("\n===== PAYMENT =====");
        System.out.println("Amount to pay: Rs." + amount);
        System.out.println("Payment successful!");
    }
}