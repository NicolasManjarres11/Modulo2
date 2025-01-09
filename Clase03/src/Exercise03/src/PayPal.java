public class PayPal implements MetodoPago{

    @Override
    public void procesarPago(double monto) {
        if (validarMonto(monto)){
            System.out.println("Pago de "+monto+" procesado con la plataforma PayPal");
        } else {
            System.out.println("Monto invalido para PayPal");
        }
    }

    @Override
    public String obtenerDetalles() {

        return "Se realizara los pagos con la plataforma Paypal";
    }

    @Override
    public boolean validarMonto(double monto) {
        return monto > 1 && monto <=10000;
    }

}
