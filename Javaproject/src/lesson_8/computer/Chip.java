package lesson_8.computer;

public class Chip {

    private String brand;
    private long frequency;
    private int generation;

    public Chip(String brand, long frequency, int generation) {
        this.brand = brand;
        this.frequency = frequency;
        this.generation = generation;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public long getFrequency() {
        return frequency;
    }

    public void setFrequency(long frequency) {
        this.frequency = frequency;
    }

    public int getGeneration() {
        return generation;
    }

    public void setGeneration(int generation) {
        this.generation = generation;
    }

    @Override
    public String toString() {
        return "Chip{" +
                "brand='" + brand + '\'' +
                ", frequency=" + frequency +
                ", generation=" + generation +
                '}';
    }
}
