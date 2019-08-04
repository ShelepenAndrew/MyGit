package MyCar;

import java.util.Objects;

public class HondaAccord extends Honda {
    private Engine engine;
    private Transmission transmission;
    private Brakes brakes;
    private Headlight headlight;
    private Interior Interior;

    HondaAccord() {
        System.out.println("Car created");
    }

    public HondaAccord(Engine engine, Transmission transmission, Brakes brakes,
                       Headlight headlight, Interior Interior) {
        setBodyType("sedan");
        setModel("Accord");
        this.engine = engine;
        this.transmission = transmission;
        this.brakes = brakes;
        this.headlight = headlight;
        this.Interior = Interior;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public Transmission getTransmission() {
        return transmission;
    }

    public void setTransmission(Transmission transmission) {
        this.transmission = transmission;
    }

    public Brakes getBrakes() {
        return brakes;
    }

    public void setBrakes(Brakes brakes) {
        this.brakes = brakes;
    }

    public Headlight getHeadlight() {
        return headlight;
    }

    public void setHeadlight(Headlight headlight) {
        this.headlight = headlight;
    }

    public Interior getInterior() {
        return Interior;
    }

    public void setInterior(Interior Interior) {
        this.Interior = Interior;
    }

    @Override
    int getTotalPrice() {
        int totalPrice = engine.getEnginePrice() + transmission.getTransmissionPrice() +
                brakes.getBrakesPrice() + headlight.getHeadlightPrice() + Interior.getInteriorPrice();
        return totalPrice;
    }

    @Override
    public void getCarInfo() {
        System.out.println("Car brand: " + CarBrand);
        System.out.println("Car model: " + getModel());
        System.out.println("Body type: " + getBodyType());
        System.out.println("Engine: " + engine.getEngineVolume());
        System.out.println("Fuel type: " + engine.getFuelType());
        System.out.println("Horsepower: " + engine.getHorsepower());
        System.out.println("Transmission: " + transmission.getTransmissionType());
        System.out.println("Brakes: " + brakes.getBrakesType());
        System.out.println("Headlight: " + headlight.getHeadlightType());
        System.out.println("Car interior:");
        System.out.println(" - Color: " + Interior.getColor());
        System.out.println(" - Material: " + Interior.getMaterial());
        System.out.println("===[Total price: " + getTotalPrice() + "]===");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        HondaAccord that = (HondaAccord) o;
        return Objects.equals(engine, that.engine) &&
                Objects.equals(transmission, that.transmission) &&
                Objects.equals(brakes, that.brakes) &&
                Objects.equals(headlight, that.headlight) &&
                Objects.equals(Interior, that.Interior);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), engine, transmission, brakes, headlight, Interior);
    }

    @Override
    public String toString() {
        return "HondaAccord{" + "engine=" + engine + ", transmission=" + transmission + ", brakes=" + brakes + ", headlight=" + headlight + ", Interior=" + Interior + '}';
    }
}