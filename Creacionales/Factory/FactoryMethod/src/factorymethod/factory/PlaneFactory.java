package factorymethod.factory;

import factorymethod.Vehicle;
import factorymethod.models.Plane;

//4. CarFactory y MotorcycleFactory: Son subclases de VehicleFactory que crean vehículos específicos.
public class PlaneFactory extends VehiculeFactory{

	@Override
	public Vehicle creatVehicle() {
		return new Plane();
	}

    

}
