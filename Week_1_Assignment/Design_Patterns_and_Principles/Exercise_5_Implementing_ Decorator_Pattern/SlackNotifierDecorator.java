//package practise.Design_Pattern.Structural_Pattern.Decorator Pattern;

public class SlackNotifierDecorator extends NotifierDecorator{
    public SlackNotifierDecorator(Notifier n) {
        super(n);
    }

    public void send(String msg){
        super.send( msg);
        System.out.println("Slack is " + msg);
    }

}

