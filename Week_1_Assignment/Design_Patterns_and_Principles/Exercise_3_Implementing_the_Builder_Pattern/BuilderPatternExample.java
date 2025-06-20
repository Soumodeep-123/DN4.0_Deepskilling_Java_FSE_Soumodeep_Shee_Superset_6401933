//package practise.Design_Pattern.Creatinal_Pattern.Builder pattern;




public class BuilderPatternExample {
    public static void main(String[] args) {
        computer pc = new computer.Builder("i5", 8, 1)
        .setGpu("RTX 3050")
        .setOs("Windows 11")
        .build();

        System.out.println("CPU: " + pc.getProcessor());
        System.out.println("RAM: " + pc.getRam() );
        System.out.println("Storage: " + pc.getStorage());
        System.out.println("GPU: " + pc.getGpu());
        System.out.println("OS: " + pc.getOs());
    }
}
