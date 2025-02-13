package co.edu.konradlorenz.model;

public class Coche extends Vehiculo {

    private int numeroPuertas;

    public Coche(String marca, String modelo, int numeroPuertas) {
        super(marca, modelo);
        this.numeroPuertas = numeroPuertas;
    }

    public int getNumeroPuertas() {
        return numeroPuertas;
    }

    public void setNumeroPuertas(int numeroPuertas) {
        this.numeroPuertas = numeroPuertas;
    }

    public void abrirPuertas() {
        System.out.println("Abriendo las " + numeroPuertas + " puertas del coche.");
    }
}
