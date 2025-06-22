//package practise.Design_Pattern.Behavioral_Patterns.Strategy;

public class PayPalPayment implements PaymentStrategy{
    private String upinum;

    public PayPalPayment(String upinum){
        this.upinum = upinum;
    }

    public void pay(int amount){
        System.out.println("Paid " + amount +"by Paypal: " + upinum);
    }
}

