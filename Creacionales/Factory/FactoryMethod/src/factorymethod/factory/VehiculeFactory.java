package factorymethod.factory;

import factorymethod.Vehicle;

// 3. VehicleFactory: Clase abstracta que contiene el método createVehicle, el cual será implementado por las subclases para definir el tipo de vehículo que se va a crear.
public abstract class VehiculeFactory {

    public abstract Vehicle creatVehicle();

}
