package Factories;

import Implements.BotonMacOS;
import Implements.MenuMacOS;
import interfaces.AbstractFactory;
import interfaces.Boton;
import interfaces.Menu;
//!(4.	Concrete Factory)
//4. Creamos las fábricas concretas para cada sistema operativo
public class MacOsFactory implements AbstractFactory{

    @Override
    public Boton crearBoton() {
      return new BotonMacOS();
    }

    @Override
    public Menu crearMenu() {
       return new MenuMacOS(); 
    }

}
