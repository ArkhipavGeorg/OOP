package N2;

import java.util.Objects;

public class FuelCar implements Car {
    public String model;
    public int age;
    public int speed;

    public FuelCar(String model, int age, int speed) {
        this.model = model;
        this.age = age;
        this.speed = speed;
    }

    @Override
    public String toString() {
        return "FuelCar{" +
                "model='" + model + '\'' +
                ", age=" + age +
                ", speed=" + speed +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        FuelCar fuelCar = (FuelCar) o;
        return age == fuelCar.age && speed == fuelCar.speed && Objects.equals(model, fuelCar.model);
    }

    @Override
    public int hashCode() {
        return Objects.hash(model, age, speed);
    }
}
