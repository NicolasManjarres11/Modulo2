import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {
        
        //Lista

        List<MetodoPago> metodosPago = new ArrayList<>();

        //Objeto

        MetodoPago tarjeta = new TarjetaCredito();
        MetodoPago paypal = new PayPal();
        MetodoPago transferencia = new TransferenciaBancaria();
        MetodoPago bitcoin = new Bitcoin();
        MetodoPago tarjetaRegalo = new TarjetaRegalo();

        //

        metodosPago.add(tarjeta);
        metodosPago.add(paypal);
        metodosPago.add(transferencia);
        metodosPago.add(bitcoin);
        metodosPago.add(tarjetaRegalo);

        double monto = 835;

        for( MetodoPago metodo : metodosPago){
            System.out.println(metodo.obtenerDetalles());
            metodo.procesarPago(monto);
            System.out.println();
        }
    }
}
