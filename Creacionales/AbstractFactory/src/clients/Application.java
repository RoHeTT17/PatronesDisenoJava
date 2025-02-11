package clients;

import interfaces.AbstractFactory;
import interfaces.Boton;
import interfaces.Menu;

/*
 5. Cliente que utiliza la Abstract Factory
 El cliente trabaja con la fábrica abstracta, sin preocuparse de qué tipo de fábrica concreta está usando. Esto facilita el cambio 
 de fábricas y, por lo tanto, de conjuntos de productos. 
 */

public class Application {

    private Boton boton;
    private Menu menu;

    public Application(AbstractFactory factory ){

        boton = factory.crearBoton();
        menu =  factory.crearMenu();

    }

    public void dibujarUI(){
        boton.dibujar();
        menu.desplegar();
    }

}
