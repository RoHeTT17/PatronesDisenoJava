package concreteCreators;

import concreteProducts.Car;
import creators.VehicleFactory;
import interfaces.Vehicle;

public class CarFactory  extends VehicleFactory{

    @Override
    protected Vehicle create(String fuelType, int maxSpeed) {
        return new Car(fuelType, "Bora", maxSpeed);
    }

}
