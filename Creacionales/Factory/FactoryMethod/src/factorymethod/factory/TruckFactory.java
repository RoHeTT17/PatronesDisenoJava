package factorymethod.factory;

import factorymethod.Vehicle;
import factorymethod.models.Truck;

public class TruckFactory  extends VehiculeFactory{

	@Override
	public Vehicle creatVehicle() {
		
		return new Truck();
	}

}
