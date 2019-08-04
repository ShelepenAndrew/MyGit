package MyCar;

import java.util.Objects;

public abstract class Car {
    private String bodyType;

    public Car() {
        bodyType = "Default";
    }

    public String getBodyType() {
        return bodyType;
    }

    public void setBodyType(String bodyType) {
        this.bodyType = bodyType;
    }

    abstract int getTotalPrice();

    abstract void getCarInfo();

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return Objects.equals(bodyType, car.bodyType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(bodyType);
    }

    @Override
    public String toString() {
        return "Car{" + "bodyType='" + bodyType + '\'' + '}';
    }
}

