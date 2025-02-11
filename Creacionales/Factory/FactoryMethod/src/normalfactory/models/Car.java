package normalfactory.models;

import normalfactory.Vehicle;

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
