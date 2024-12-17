package Composite;

public class Almacenamiento {
    private int capacidad; //Private es para encapsular

    public Almacenamiento(int capacidad) {
        this.capacidad = capacidad;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public void mostrarDetalles(){
        System.out.println("La capacidad es de "+ this.capacidad+" GB");
    }

    

}
