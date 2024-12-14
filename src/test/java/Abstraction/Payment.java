package Abstraction;

public abstract class Payment {
    String payerName;

    public Payment(String payerName){
        this.payerName = payerName;
    }

    // Abstract method to be implemented by subclasses(child classes).
    abstract void processPayment(double amount);

    // Concrete method
    void transactionDetails(double amount){
        System.out.println("Transaction details:");
        System.out.println("Payer: " + payerName);
        System.out.println("Amount: " + amount);
    }



}
