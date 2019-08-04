package MyCar;

import java.util.Objects;

public class Headlight extends Part {
    private String headlightType;

    Headlight() {
        System.out.println("Headlight making");
    }

    public Headlight(String headlightType) {
        this.headlightType = headlightType;
    }

    public String getHeadlightType() {
        return headlightType;
    }

    public int getHeadlightPrice() {
        switch (headlightType) {
            case "laser":
                setPrice(3800);
                break;
            case "LED":
                setPrice(2500);
                break;
            case "xenon":
                setPrice(1111);
                break;
        }
        return getPrice();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Headlight that = (Headlight) o;
        return Objects.equals(headlightType, that.headlightType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), headlightType);
    }

    @Override
    public String toString() {
        return "Headlight{" + "headlightType='" + headlightType + '\'' + '}';
    }
}