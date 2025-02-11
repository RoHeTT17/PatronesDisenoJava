package factorymethod.factory;

import factorymethod.Vehicle;
import factorymethod.models.Car;

//4. CarFactory y MotorcycleFactory: Son subclases de VehicleFactory que crean vehículos específicos.
public class CarFactory  extends VehiculeFactory{

	@Override
	public Vehicle creatVehicle() {
		return new Car();
	}

}
