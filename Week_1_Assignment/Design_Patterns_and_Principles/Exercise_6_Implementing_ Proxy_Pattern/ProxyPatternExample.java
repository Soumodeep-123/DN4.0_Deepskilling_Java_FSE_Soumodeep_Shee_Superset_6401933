//package practise.Design_Pattern.Structural_Pattern.Proxy Pattern;

interface Image{
    void display();
}

class RealImg implements Image{
    private String filename;

    public RealImg(String filename) {
        this.filename = filename;
        load();
    }

    public void load(){
        System.out.println("Loading " + filename);
    }

    public void display(){
        System.out.println("Displaying " + filename);
    }

}

class proxyImg implements Image{
    private RealImg realImg;
    private String filename;

    public proxyImg(String fileName){
        this.filename = fileName;
    }

    public void display(){
        if(realImg == null){
            realImg = new RealImg(filename);
        }
        realImg.display();
    }
}

public class ProxyPatternExample {
    public static void main(String args[]) {
        Image i1 = new proxyImg("dog.jpg");
        Image i2 = new proxyImg("cat.jpg");
        i1.display();
        i2.display(); 

    }
    
}
