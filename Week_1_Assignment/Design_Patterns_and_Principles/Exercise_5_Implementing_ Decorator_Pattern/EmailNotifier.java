//package practise.Design_Pattern.Structural_Pattern.Decorator Pattern;
public interface Notifier{
    void send(String msg);
}

public class EmailNotifier implements Notifier{
    public void send(String msg){
        System.out.println("Email is "+ msg);
    }
}
