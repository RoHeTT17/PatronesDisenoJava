package factorymethod.models;

import factorymethod.Vehicle;

//2. Car y Motorcycle: Son implementaciones concretas de Vehicle.
public class Car implements Vehicle {

	@Override
	public void start() {
        System.out.println("----->Run Car");
	}

	@Override
	public void stop() {
        System.out.println("----->Stop Car");
	}

}
