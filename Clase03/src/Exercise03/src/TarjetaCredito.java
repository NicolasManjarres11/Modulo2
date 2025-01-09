public class TarjetaCredito implements MetodoPago{

    @Override
    public void procesarPago(double monto) {
        if (validarMonto(monto)){
            System.out.println("Pago de "+monto+" procesado con la tarjeta de credito");
        } else {
            System.out.println("Monto invalido para tarjeta de credito");
        }
    }

    @Override
    public String obtenerDetalles() {
        
        return "Se realizara los pagos con la tarjeta de credito";
    }

    @Override
    public boolean validarMonto(double monto) {
        return monto > 0;
    }

}
