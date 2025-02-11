package normalfactory.factory;

import normalfactory.Vehicle;
import normalfactory.models.Car;
import normalfactory.models.Motorcycle;
import normalfactory.models.Plane;
import normalfactory.models.Truck;

public class VehiculeFactory {

    public Vehicle creatVehicle(String typeVehicule){

        switch (typeVehicule) {
            case "Car":
                return new Car();
                
            case "Motorcycle":
                return new Motorcycle();
                
            case "Truck":
                return new Truck();
                
            case "Plane":
                return new Plane();
                
            default:
                return null;
        }

    };

}
