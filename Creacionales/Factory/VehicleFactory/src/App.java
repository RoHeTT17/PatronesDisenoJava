import concreteCreators.CarFactory;
import concreteCreators.TruckFactory;
import creators.VehicleFactory;
import interfaces.Vehicle;

public class App {
    public static void main(String[] args) throws Exception {

        VehicleFactory carFactory = new CarFactory();

        Vehicle car = carFactory.createVehicle("Gas",240);
        car.startEngine();

        System.out.println("***************************************************\n\n\n");
    
        VehicleFactory truckFactory = new TruckFactory();
        truckFactory.createVehicle("Disel",320);

    }
}
