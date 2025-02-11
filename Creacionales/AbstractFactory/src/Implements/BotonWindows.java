package Implements;

import interfaces.Boton;
//!(Concrete Product)
//2. Creamos implementaciones específicas para cada sistema operativo
public class BotonWindows implements Boton {

    @Override
    public void dibujar() {

        System.out.println("Crear un botón estilo windows");

    }


}
