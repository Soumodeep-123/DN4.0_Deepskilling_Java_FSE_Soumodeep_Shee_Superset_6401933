//package practise.Design_Pattern.Structural_Pattern.Decorator Pattern;

public abstract class NotifierDecorator implements Notifier{
    protected Notifier wrap;

    public NotifierDecorator(Notifier n) {
        this.wrap = n;
    }

    public void send(String msg){
        wrap.send( msg);
    }

}
