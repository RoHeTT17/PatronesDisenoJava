import Factories.MacOsFactory;
import Factories.WindowsFactory;
import clients.Application;
import interfaces.AbstractFactory;

/*

El patrón de diseño Abstract Factory es un patrón creacional que permite crear familias de objetos relacionados sin especificar 
las clases concretas de los objetos. Este patrón es útil cuando tienes varias variantes de un conjunto de objetos y quieres asegurarte
de que se utilicen juntos de manera consistente. Proporciona una interfaz para crear familias de objetos relacionados sin que el
cliente necesite saber sobre las clases específicas de estos objetos.


Los pasos para crear un  Abstract Factory:

1. Definimos las interfaces de los productos (Package interfaces) //!(Abstract Product)
2. Creamos implementaciones específicas para cada sistema operativo (Package Implements) //!(Concrete Product)
3. Creamos la interfaz Abstract Factory (Package interfaces)  //!(Abstract Factory)
4. Creamos las fábricas concretas para cada sistema operativo (Package Factorys) //!(Concrete Factory)
5. Cliente que utiliza la Abstract Factory (Package clientes) //!(Client)
6. Uso del patrón en el programa principal (Ejemplo en esta clase)
*/

public class App {
    //6. Uso del patrón en el programa principal
    public static void main(String[] args) throws Exception {
        //!(Client)
        AbstractFactory factory;

        factory = new MacOsFactory();

        Application app = new Application(factory);

        app.dibujarUI();

        // Si quisiéramos cambiar a Windows, solo cambiaríamos la fábrica
        System.out.println("Cambiando de fabrica");

        factory = new WindowsFactory();

        factory.crearBoton().dibujar();

        

        app = new Application(factory);
       
        app.dibujarUI();

    }
}
