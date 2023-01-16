package lesson_8.computer;

import java.util.Arrays;

public class Computer {

    //1. Fields
    private GraphicCard gpu;
    private Chip cpu;
    private Memory[] ram;
    private SolidDrive ssd;
    public double price;

    //2. Constructors

    public Computer(GraphicCard gpu, Chip cpu, Memory[] ram, SolidDrive ssd, double price) {
        this.gpu = gpu;
        this.cpu = cpu;
        this.ram = ram;
        this.ssd = ssd;
        this.price = price;
    }


    //3. Getter/Setter


    public GraphicCard getGpu() {
        return gpu;
    }

    public void setGpu(GraphicCard gpu) {
        this.gpu = gpu;
    }

    public Chip getCpu() {
        return cpu;
    }

    public void setCpu(Chip cpu) {
        this.cpu = cpu;
    }

    public Memory[] getRam() {
        return ram;
    }

    public void setRam(Memory[] ram) {
        this.ram = ram;
    }

    public SolidDrive getSsd() {
        return ssd;
    }

    public void setSsd(SolidDrive ssd) {
        this.ssd = ssd;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "gpu=" + gpu +
                ", cpu=" + cpu +
                ", ram=" + Arrays.toString(ram) +
                ", ssd=" + ssd +
                ", price=" + price +
                '}';
    }
}
