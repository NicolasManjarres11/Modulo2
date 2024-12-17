package Composite;

public class Motherboard {

    //La tarjeta madre contiene todos los componentes

    private Procesador procesador;   /*Acceso - Clase - nombre objeto*/
    private Memoria memoria; //Los atributos son otras clases, en esto se basa la composicion
    private Grafica tarjetaGrafica;
    private Almacenamiento almacenamiento;

    public Motherboard(){

        //El constructor instacia los componentes(otras clases)

        this.almacenamiento = new Almacenamiento(1000);
        this.memoria = new Memoria(32);
        this.procesador = new Procesador(12,12);
        this.tarjetaGrafica = new Grafica(16);

    }

    public void getMotherBoardComponents(){
        System.out.println("Componentes de la tarjeta madre.");
        almacenamiento.mostrarDetalles();
        memoria.mostrarDetalles();
        procesador.mostrarDetalles();
        tarjetaGrafica.mostrarDetalles();
    }

}
