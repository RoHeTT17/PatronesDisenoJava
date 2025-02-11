package creators;

import interfaces.Vehicle;

public abstract class VehicleFactory {

    protected abstract Vehicle create(String fuelType, int maxSpeed);

    public Vehicle createVehicle(String fuelType, int maxSpee){

        Vehicle vehicle = create(fuelType,maxSpee);

        System.out.println("Vehículo creado con éxito:");
        System.out.println("Tipo de combustible: " + vehicle.getfuelType());
        System.out.println("Velocidad máxima: " + vehicle.getMaxSpeed() + " km/h");
        System.out.println("Marca: " + vehicle.getMarca());

        return vehicle;
    
    } 
    

    /* 

    No estoy seguro si haciendo esto se esta rompiendo la idea del patron de diseño

    protected abstract Vehicle create(String fuelType, int maxSpeed,int puertas);
    public Vehicle createVehicle(String fuelType, int maxSpee,int puerta){

        Vehicle vehicle = create(fuelType,maxSpee,puerta);

        System.out.println("Vehículo creado con éxito:");
        System.out.println("Tipo de combustible: " + vehicle.getfuelType());
        System.out.println("Velocidad máxima: " + vehicle.getMaxSpeed() + " km/h");
        System.out.println("Marca: " + vehicle.getMarca());
        System.out.println("puertas: " + puerta);

        return vehicle;
    
    } 

    */


}
