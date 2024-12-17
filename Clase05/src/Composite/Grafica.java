package Composite;

public class Grafica {

    private int capacidad; //Private es para encapsular

    public Grafica(int capacidad) {
        this.capacidad = capacidad;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public void mostrarDetalles(){
        System.out.println("La memoria es de "+ this.capacidad+" GB");
    }

}
