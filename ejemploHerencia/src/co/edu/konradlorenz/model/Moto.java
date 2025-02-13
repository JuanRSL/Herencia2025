package co.edu.konradlorenz.model;

public class Moto extends Vehiculo {

    private boolean tieneSidecar;

    public Moto(String marca, String modelo, boolean tieneSidecar) {
        super(marca, modelo);
        this.tieneSidecar = tieneSidecar;
    }

    public boolean isTieneSidecar() {
        return tieneSidecar;
    }

    public void setTieneSidecar(boolean tieneSidecar) {
        this.tieneSidecar = tieneSidecar;
    }

    public void hacerCaballito() {
        System.out.println("La moto está haciendo un caballito.");
    }
}
