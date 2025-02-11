package factorymethod.models;

import factorymethod.Vehicle;

//2. Car y Motorcycle: Son implementaciones concretas de Vehicle.
public class Truck implements Vehicle{
    
    @Override
	public void start() {
        System.out.println("----->Run Truck");
	}

	@Override
	public void stop() {
        System.out.println("----->Stop Truck");
	}
}
