package Composition;

public class Computer {
    private Processor processor;
    private Ram ram;
    private String gpu;

    public Computer(Processor processor, Ram ram, String gpu) { // constructor of classes
        this.processor = processor;
        this.ram = ram;
        this.gpu = gpu;


    }

    public void run() {
        System.out.println(processor.numberOfCores);
    }

//    public void configure() {
//        System.out.println("Booting...");
//        System.out.println("Configure cpu...: " + cpu);
//        System.out.println("Configure ram...:" + ram);
//        System.out.println("Configure gpu...:" + gpu);
//    }


    // Computer computer = new Computer("demo cpu", "demo ram", "demo gpu");
    // computer.configure();


}
