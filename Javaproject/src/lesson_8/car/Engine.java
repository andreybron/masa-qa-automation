package lesson_8.car;

public class Engine {

    private int horsePower;
    private String model;
    private boolean isElectric;

    public Engine(int horsePower, String model, boolean isElectric) {
        this.horsePower = horsePower;
        this.model = model;
        this.isElectric = isElectric;
    }

    public int getHorsePower() {
        return horsePower;
    }

    public void setHorsePower(int horsePower) {
        this.horsePower = horsePower;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public boolean isElectric() {
        return isElectric;
    }

    public void setElectric(boolean electric) {
        isElectric = electric;
    }

    @Override
    public String toString() {
        return "Engine{" +
                "horsePower=" + horsePower +
                ", model='" + model + '\'' +
                ", isElectric=" + isElectric +
                '}';
    }
}
