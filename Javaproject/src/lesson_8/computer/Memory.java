package lesson_8.computer;

public class Memory {
    private int ramAmount;
    private String brand;

    public Memory(int ramAmount, String brand) {
        this.ramAmount = ramAmount;
        this.brand = brand;
    }

    public int getRamAmount() {
        return ramAmount;
    }

    public void setRamAmount(int ramAmount) {
        this.ramAmount = ramAmount;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    @Override
    public String toString() {
        return "Memory{" +
                "ramAmount=" + ramAmount +
                ", brand='" + brand + '\'' +
                '}';
    }
}
