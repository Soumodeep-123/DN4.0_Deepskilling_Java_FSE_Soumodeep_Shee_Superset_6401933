//package practise.Design_Pattern.Creatinal_Pattern.Adapter Design Pattern;

public class AdapterPatternExample {
    public static void main(String args[]) {
        PaymentProcessor p = new Gpayadapter(new Gpay());
        p.processPayment(1000.0);

    }
}
