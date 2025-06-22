//package practise.Design_Pattern.Structural_Pattern.Decorator Pattern;


 interface Notifier{
    void send(String msg);
}

 class EmailNotifier implements Notifier{
    public void send(String msg){
        System.out.println("Email is "+ msg);
    }
}

 abstract class NotifierDecorator implements Notifier{
    protected Notifier wrap;

    public NotifierDecorator(Notifier n) {
        this.wrap = n;
    }

    public void send(String msg){
        wrap.send( msg);
    }

}

 class SMSNotifierDecorator extends NotifierDecorator{
    public SMSNotifierDecorator(Notifier n) {
        super(n);
    }

    public void send(String msg){
        super.send( msg);
        System.out.println("SMS is " + msg);
    }

}


 class SlackNotifierDecorator extends NotifierDecorator{
    public SlackNotifierDecorator(Notifier n) {
        super(n);
    }

    public void send(String msg){
        super.send( msg);
        System.out.println("Slack is " + msg);
    }

}





public class DecoratorPatternExample {
    public static void main(String args[]){
        Notifier n1 = new EmailNotifier();
        n1.send("hello guys"); 

        Notifier n2 = new SMSNotifierDecorator(new EmailNotifier());
        n2.send("good morning");

        Notifier n3 = new SlackNotifierDecorator(new SMSNotifierDecorator(new EmailNotifier()));
        n3.send("how r u");


    }
}
