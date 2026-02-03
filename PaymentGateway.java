interface PaymentMethod {
    void pay(double amount);
}

class CreditCardPayment implements PaymentMethod {

    private String cardNumber;
    private String cvv;

    public CreditCardPayment(String cardNumber, String cvv) {
        this.cardNumber = cardNumber;
        this.cvv = cvv;
    }

    public void pay(double amount) {
        System.out.println("Paid Rs." + amount + " using Credit Card");
        System.out.println("Card Number: " + cardNumber);
    }
}

class BankTransferPayment implements PaymentMethod {

    private String accountNumber;
    private String ifscCode;

    public BankTransferPayment(String accountNumber, String ifscCode) {
        this.accountNumber = accountNumber;
        this.ifscCode = ifscCode;
    }

    public void pay(double amount) {
        System.out.println("Paid Rs." + amount + " using Bank Transfer");
        System.out.println("Account Number: " + accountNumber);
    }
}

class UPIPayment implements PaymentMethod {

    private String upiId;

    public UPIPayment(String upiId) {
        this.upiId = upiId;
    }

    public void pay(double amount) {
        System.out.println("Paid Rs." + amount + " using UPI");
        System.out.println("UPI ID: " + upiId);
    }
}

public class PaymentGateway {

    public static void main(String[] args) {

        PaymentMethod p1 = new CreditCardPayment("1111-2222-3333-4444", "321");
        p1.pay(500);

        System.out.println();

        PaymentMethod p2 = new BankTransferPayment("9876543210", "HDFC0001234");
        p2.pay(1500);

        System.out.println();

        PaymentMethod p3 = new UPIPayment("vaishnovi@upi");
        p3.pay(300);
    }
}
