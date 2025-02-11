package Implements;

import interfaces.Menu;
//!(Concrete Product)
//2. Creamos implementaciones específicas para cada sistema operativo
public class MenuMacOS implements Menu{

    @Override
    public void desplegar() {
        System.out.println("Crear ménu para MacOS");
    }

    

}
