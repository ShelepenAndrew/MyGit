package MyCar;

import java.util.Objects;

public class Honda extends Car {
    public static final String CarBrand = "Honda";
    private String model;


    Honda() {
        model = "Default";
    }

    @Override
    int getTotalPrice() {
        return 0;
    }

    @Override
    void getCarInfo() {
        System.out.println("About the car.");
        System.out.println("Total price: " + getTotalPrice());
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Honda honda = (Honda) o;
        return Objects.equals(model, honda.model);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), model);
    }

    @Override
    public String toString() {
        return "Honda{" + "Model='" + model + '\'' + '}';
    }
}
