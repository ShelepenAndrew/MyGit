package MyCar;

import java.util.Objects;

public class Interior extends Part {
    private String color;
    private String material;

    Interior() {
        System.out.println("Creating interior");
    }

    public Interior(String color, String material) {
        this.color = color;
        this.material = material;
    }

    public String getColor() {
        return color;
    }

    public String getMaterial() {
        return material;
    }

    public int getInteriorPrice() {
        switch (material) {
            case "velour":
                setPrice(3700);
                break;
            case "leather":
                setPrice(5200);
                break;
        }
        return getPrice();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Interior that = (Interior) o;
        return Objects.equals(color, that.color) &&
                Objects.equals(material, that.material);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), color, material);
    }

    @Override
    public String toString() {
        return "Interior{" + "color='" + color + '\'' + ", material='" + material + '\'' + '}';
    }
}
