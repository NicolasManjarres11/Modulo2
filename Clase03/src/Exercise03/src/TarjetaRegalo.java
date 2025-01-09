public class TarjetaRegalo implements MetodoPago{

    @Override
    public void procesarPago(double monto) {
        if (validarMonto(monto)){
            System.out.println("Pago de "+monto+" procesado con tarjeta de regalo");
        } else {
            System.out.println("Monto invalido para tarjeta de regalo");
        }
    }

    @Override
    public String obtenerDetalles() {
        return "Se procesará el pago con tarjeta de regalo";
    }

    @Override
    public boolean validarMonto(double monto) {
        
        return monto > 0 && monto <=500;
    }

}
