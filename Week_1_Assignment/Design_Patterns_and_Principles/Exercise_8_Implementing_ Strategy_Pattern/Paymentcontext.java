//package practise.Design_Pattern.Behavioral_Patterns.Strategy;
public class Paymentcontext {
    private PaymentStrategy s;

    public Paymentcontext(PaymentStrategy s){
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
