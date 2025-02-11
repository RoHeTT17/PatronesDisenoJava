package interfaces;

//!(Abstract Factory)
//3. Creamos la interfaz Abstract Factory
//El nombre de la interfaces pude cualquiera, pero coloque este para entender el ejemplo.
public interface AbstractFactory {

    //Retornamos una interfas
    Boton crearBoton();
    Menu  crearMenu();

}
