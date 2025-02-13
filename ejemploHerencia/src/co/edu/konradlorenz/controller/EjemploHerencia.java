package co.edu.konradlorenz.controller;

import co.edu.konradlorenz.model.Coche;
import co.edu.konradlorenz.model.Moto;
import co.edu.konradlorenz.view.VistaVehiculo;

public class EjemploHerencia {

    public static void main(String[] args) {
        Coche coche = new Coche("Toyota", "Corolla", 4);
        Moto moto = new Moto("Harley-Davidson", "Sportster", false);

        VistaVehiculo vista = new VistaVehiculo();

        ControladorVehiculo controladorCoche = new ControladorVehiculo(coche, vista);
        ControladorVehiculo controladorMoto = new ControladorVehiculo(moto, vista);

        System.out.println("=== Información del Coche ===");
        controladorCoche.run();

        System.out.println("\n=== Información de la Moto ===");
        controladorMoto.run();
    }

}
