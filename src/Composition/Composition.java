package Composition;

//being part of the

public class Composition {
    public static void main(String[] args) {
        Processor processor = new Processor();
        Ram ram = new Ram();

        processor.setNumberOfCores(5);
        ram.setName("linux");

        Computer computer = new Computer(processor, ram, "3gpu");

        computer.run();

    }


}

class Processor {
    String name;
    int numberOfCores;

    public void setNumberOfCores(int numberOfCores) {
        this.numberOfCores = numberOfCores;
    }
}

class Ram {
    String name;
    int size;

    public void setName(String name) {
        this.name = name;
    }

}
