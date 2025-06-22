// package practise.Design_Pattern.Behavioral_Patterns.Strategy;
public class CreditCardPayment implements PaymentStrategy{
    private String cardnum;

    public CreditCardPayment(String cardnum){
        this.cardnum = cardnum;
    }

    public void pay(int amount){
        System.out.println("Paid " + amount +"by Card: " + cardnum);
    }
}


