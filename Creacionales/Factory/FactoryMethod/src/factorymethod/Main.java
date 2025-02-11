package factorymethod;

import factorymethod.factory.CarFactory;
import factorymethod.factory.PlaneFactory;

import factorymethod.models.Plane;


/*
 Estructura del Código:

 Tendremos las siguientes clases e interfaces:

  1. Vehicle: Interfaz para el tipo de producto, que representa el vehículo.
  2. Car y Motorcycle: Son implementaciones concretas de Vehicle.
  3. VehicleFactory: Clase abstracta que contiene el método createVehicle, el cual será implementado por las subclases para definir el tipo de vehículo que se va a crear.
  4. CarFactory y MotorcycleFactory: Son subclases de VehicleFactory que crean vehículos específicos.
  
 */

public class Main {

    public static void main(String[] args) {
        
        Vehicle car   = new CarFactory().creatVehicle();
        Vehicle plane = new PlaneFactory().creatVehicle();
        

        car.start();
        plane.start();

        System.out.println("----------------------------------------------");
        
        Plane planeNormal = (Plane) plane;
        planeNormal.start();
        planeNormal.fly();


    }

}
