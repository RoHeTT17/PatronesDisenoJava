package concreteProducts;

import interfaces.Vehicle;

public class Truck implements Vehicle {

    private String typeFuel; 
    private String marca;
    private int maxSpeed; 

    //Este atributo no esta en la interface
    private int puertas;

    public Truck(String typeFuel, String marca, int maxSpeed){

        this.typeFuel = typeFuel;
        this.marca = marca;
        this.maxSpeed = maxSpeed;
        this.puertas = puertas;
    }


    @Override
    public void startEngine() {
        System.out.println("Encendido");
    }

    @Override
    public void stopEngine() {
        System.out.println("Apagado");
    }

    @Override
    public String getfuelType() {
        return this.typeFuel;
    }

    @Override
    public String getMarca() {
        return this.marca;
    }

    @Override
    public int getMaxSpeed() {
        return this.maxSpeed;
    }

    public int getPuertas(){
        return this.puertas;
    }

}
