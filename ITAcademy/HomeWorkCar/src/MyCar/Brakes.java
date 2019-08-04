package MyCar;

import java.util.Objects;

public class Brakes extends Part {
    private String brakesType;

    Brakes() {
        System.out.println("Brakes creation.");
    }

    public Brakes(String brakesType) {
        this.brakesType = brakesType;
    }

    public String getBrakesType() {
        return brakesType;
    }

    public int getBrakesPrice() {
        switch (brakesType) {
            case "disc":
                setPrice(4500);
                break;
            case "drum":
                setPrice(3000);
                break;
            case "mixed":
                setPrice(3800);
                break;
        }
        return getPrice();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Brakes brakes = (Brakes) o;
        return Objects.equals(brakesType, brakes.brakesType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), brakesType);
    }

    @Override
    public String toString() {
        return "Brakes{" + "brakesType='" + brakesType + '\'' + '}';
    }
}
