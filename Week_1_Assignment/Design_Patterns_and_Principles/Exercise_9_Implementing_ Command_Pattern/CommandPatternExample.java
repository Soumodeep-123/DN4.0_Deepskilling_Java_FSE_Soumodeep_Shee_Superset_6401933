//package practise.Design_Pattern.Behavioral_Patterns.Command_Pattern;

interface Command {
    void execute();
}

class light {
    public void turnon(){
        System.out.println("Light is turned on");
    }
    public void turnoff(){
        System.out.println("Light is turned off");
    }
}

class LightOnCommand implements Command{
    private light l;

    public LightOnCommand (light l){
        this.l = l;
    }

    public void execute(){
        l.turnon();
    }

}


class LightOffCommand implements Command{
    private light l;

    public LightOffCommand (light l){
        this.l = l;
    }

    public void execute(){
        l.turnoff();
    }

}

class RemoteControl{
    private Command c;

    public void setCommand (Command c){
        this.c = c;
    }

    public void pressButton(){
        if(c != null){
            c.execute();
            
        } else {
            System.out.println("No command set");
        }
    }
}



public class CommandPatternExample {
    public static void main(String[] args) {
        light l = new light();

        Command lightOn = new LightOnCommand(l);
        Command lightOff = new LightOffCommand(l);

        RemoteControl r = new RemoteControl();
        r.setCommand(lightOn);
        r.pressButton(); 
        r.setCommand(lightOff);
        r.pressButton();
    }
}
