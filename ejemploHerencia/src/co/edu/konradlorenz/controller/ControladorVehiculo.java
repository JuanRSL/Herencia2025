package co.edu.konradlorenz.controller;

import co.edu.konradlorenz.model.Coche;
import co.edu.konradlorenz.model.Moto;
import co.edu.konradlorenz.model.Vehiculo;
import co.edu.konradlorenz.view.VistaVehiculo;

public class ControladorVehiculo {

    private Vehiculo vehiculo;
    private VistaVehiculo vista;

    public ControladorVehiculo(Vehiculo vehiculo, VistaVehiculo vista) {
        this.vehiculo = vehiculo;
        this.vista = vista;
    }

    public void mostrarDetalles() {
        String tipo = vehiculo.getClass().getSimpleName();
        String detallesAdicionales = "";

        if (vehiculo instanceof Coche) {
            detallesAdicionales = "Número de puertas: " + ((Coche) vehiculo).getNumeroPuertas();
        } else if (vehiculo instanceof Moto) {
            detallesAdicionales = "Tiene sidecar: " + ((Moto) vehiculo).isTieneSidecar();
        }

        vista.mostrarDetallesVehiculo(vehiculo.getMarca(), vehiculo.getModelo(), tipo, detallesAdicionales);
    }

    public void arrancarVehiculo() {
        vehiculo.arrancar();
        vista.mostrarAccion("El vehículo ha arrancado.");
    }

    public void detenerVehiculo() {
        vehiculo.detener();
        vista.mostrarAccion("El vehículo se ha detenido.");
    }

    public void realizarAccionEspecial() {
        if (vehiculo instanceof Coche) {
            ((Coche) vehiculo).abrirPuertas();
        } else if (vehiculo instanceof Moto) {
            ((Moto) vehiculo).hacerCaballito();
        }
    }

    public void run() {
        mostrarDetalles();
        arrancarVehiculo();
        realizarAccionEspecial();
        detenerVehiculo();
    }
}
