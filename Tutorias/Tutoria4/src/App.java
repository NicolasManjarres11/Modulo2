public class App {
    public static void main(String[] args) throws Exception {
        
        Ticket t1 = new Ticket("Nicolas", "Colombia");
        Ticket t2 = new Ticket("Andres", "Colombia");
        Ticket t3 = new Ticket("Luis", "Colombia"); 

        int ticketVendidos = Ticket.contadotTickets;
        System.out.println("Ticket vendidos: " + ticketVendidos);


        t1.ImprimirTicket();

    }
}
