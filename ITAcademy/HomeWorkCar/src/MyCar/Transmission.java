package MyCar;

import java.util.Objects;

public class Transmission extends Part {
    private String transmissionType;
    private int numberOfGears;

    Transmission() {
        System.out.println("Gearbox Creation");
    }

    public Transmission(String transmissionType, int numberOfGears) {
        this.transmissionType = transmissionType;
        this.numberOfGears = numberOfGears;
    }

    public Transmission(String transmissionType) {
        this.transmissionType = transmissionType;
    }

    public String getTransmissionType() {
        return transmissionType;
    }

    public int getTransmissionPrice() {
        switch (transmissionType) {
            case "automatic":
                setPrice(5500);
                break;
            case "mechanical":
                setPrice(2500);
                break;
        }

        return getPrice();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Transmission that = (Transmission) o;
        return numberOfGears == that.numberOfGears &&
                Objects.equals(transmissionType, that.transmissionType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), transmissionType, numberOfGears);
    }

    @Override
    public String toString() {
        return "Transmission{" + "transmissionType='" + transmissionType + '\'' + ", numberOfGears=" + numberOfGears + '}';
    }
}