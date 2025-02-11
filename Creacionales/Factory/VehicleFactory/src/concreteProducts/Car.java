package concreteProducts;

import interfaces.Vehicle;

public class Car implements Vehicle{

    private String typeFuel; 
    private String marca;
    private int maxSpeed; 

    public Car(String typeFuel, String marca, int maxSpeed ){

        this.typeFuel = typeFuel;
        this.marca = marca;
        this.maxSpeed = maxSpeed;
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

}
