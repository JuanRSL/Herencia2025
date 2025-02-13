package co.edu.konradlorenz.view;

public class VistaVehiculo {
    public void mostrarDetallesVehiculo(String marca, String modelo, String tipo, String detallesAdicionales) {
        System.out.println("Tipo de vehículo: " + tipo);
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Detalles adicionales: " + detallesAdicionales);
    }

    public void mostrarAccion(String accion) {
        System.out.println(accion);
    }
}
