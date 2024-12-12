

public class Ticket {

    public static int contadotTickets = 0;

    String nombre;
    String origen;

    //metodo constructror -> permite crear las instancias de las clases
    
    public Ticket(String nombre, String origen) {
        this.nombre = nombre;
        this.origen = origen;
        contadotTickets++;
    }

    public void ImprimirTicket() {
        System.out.println("Nombre: " + this.nombre);
        System.out.println("Origen: " + this.origen);
    }


}
