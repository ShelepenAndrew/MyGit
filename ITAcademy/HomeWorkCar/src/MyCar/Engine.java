package MyCar;

import java.util.Objects;

public class Engine extends Part {
    private String fuelType;
    private double engineVolume;
    private int horsepower;

    Engine() {
        System.out.println("Engine creation");
    }

    public Engine(String fuelType, double engineVolume) {
        this.fuelType = fuelType;
        this.engineVolume = engineVolume;
        this.horsepower = getHorsepower();
    }

    public String getFuelType() {
        return fuelType;
    }

    public double getEngineVolume() {
        return engineVolume;
    }

    public int getHorsepower() {
        if (engineVolume == 1.8) {
            horsepower = 136;
        } else if (engineVolume == 2.0) {
            horsepower = 190;
        } else if (engineVolume == 2.5) {
            horsepower = 220;
        } else if (engineVolume == 3.0) {
            horsepower = 300;
        }
        return horsepower;
    }

    public int getEnginePrice() {
        if (engineVolume == 1.8) {
            setPrice(2000);
        } else if (engineVolume == 2.0) {
            setPrice(3000);
        } else if (engineVolume == 2.5) {
            setPrice(4000);
        } else if (engineVolume == 3.0) {
            setPrice(5000);
        }
        return getPrice();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Engine engine = (Engine) o;
        return Double.compare(engine.engineVolume, engineVolume) == 0 &&
                horsepower == engine.horsepower &&
                Objects.equals(fuelType, engine.fuelType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), fuelType, engineVolume, horsepower);
    }

    @Override
    public String toString() {
        return "Engine{" + "fuelType='" + fuelType + '\'' + ", engineVolume=" + engineVolume + ", horsepower=" + horsepower + '}';
    }
}
