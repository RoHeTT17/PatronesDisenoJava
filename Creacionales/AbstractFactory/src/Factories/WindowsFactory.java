package Factories;

import Implements.BotonWindows;
import Implements.MenuWindows;
import interfaces.AbstractFactory;
import interfaces.Boton;
import interfaces.Menu;
//!(4.	Concrete Factory)
//4. Creamos las fábricas concretas para cada sistema operativo
public class WindowsFactory implements AbstractFactory{

    @Override
    public Boton crearBoton() {

        return new BotonWindows();

    }

    @Override
    public Menu crearMenu() {

        return new MenuWindows();

    }

}
