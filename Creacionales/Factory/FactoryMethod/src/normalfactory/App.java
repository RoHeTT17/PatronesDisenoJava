package normalfactory;

import normalfactory.factory.VehiculeFactory;

public class App {
    public static void main(String[] args) throws Exception {
        
        //Crear instancia de la Fabrica (factory)

        VehiculeFactory vehiculeFactory = new VehiculeFactory();
        
        Vehicle car   = vehiculeFactory.creatVehicle("Car");
        Vehicle moto  = vehiculeFactory.creatVehicle("Motorcycle");
        Vehicle troca = vehiculeFactory.creatVehicle("Truck");
        Vehicle avion = vehiculeFactory.creatVehicle("Plane");

        car.start();
        moto.start();
        troca.start();
        avion.start();
        

    }
}
