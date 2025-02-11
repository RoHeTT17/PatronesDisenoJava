package factorymethod.models;

import factorymethod.Vehicle;

//2. Car y Motorcycle: Son implementaciones concretas de Vehicle.
public class Plane implements Vehicle{

    @Override
	public void start() {
        System.out.println("----->Run Plane");
	}

	@Override
	public void stop() {
        System.out.println("----->Stop Plane");
	}

    //Cada model puede tener sus métodos 
    public void fly(){
        System.out.println("----->Andamos en el aigre");
    }

}
