public class Gpayadapter implements PaymentProcessor {
    
    private Gpay g;  
    public Gpayadapter(Gpay g) {
        this.g = g;
    }

    @Override
    public void processPayment(double amount) {
        g.payment(amount); 
    }
}
