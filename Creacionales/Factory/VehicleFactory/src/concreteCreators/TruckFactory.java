package concreteCreators;

import concreteProducts.Truck;
import creators.VehicleFactory;
import interfaces.Vehicle;

public class TruckFactory extends VehicleFactory{

    @Override
    protected Vehicle create(String fuelType, int maxSpeed) {
        return new Truck(fuelType, "**Marca***", maxSpeed);
    }

}
