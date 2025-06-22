//package practise.Design_Pattern.Behavioral_Patterns.Strategy;

 interface PaymentStrategy {
    void pay(int amount);
}

 class CreditCardPayment implements PaymentStrategy{
    private String cardnum;

    public CreditCardPayment(String cardnum){
        this.cardnum = cardnum;
    }

    public void pay(int amount){
        System.out.println("Paid " + amount +"rs. by Card: " + cardnum);
    }
}


 class PayPalPayment implements PaymentStrategy{
    private String upinum;

    public PayPalPayment(String upinum){
        this.upinum = upinum;
    }

    public void pay(int amount){
        System.out.println("Paid " + amount +"rs. by Paypal: " + upinum);
    }
}

 class Paymentcontext {
    private PaymentStrategy s;

    public void PaymentStrategy(PaymentStrategy s){
        this.s = s;
    }

    public void pay(int amount){
        if(s == null){
            System.out.println("No payment");
        } else{
            s.pay(amount);
        }
    }

} 



public class StrategyPatternExample {
    public static void main(String args[]){
        Paymentcontext c = new Paymentcontext();

        c.PaymentStrategy(new CreditCardPayment("1234-5678-9876"));
        c.pay(50000);

        c.PaymentStrategy(new PayPalPayment("1234-5678-9876"));
        c.pay(45000);
    }
}
