public class Bitcoin implements MetodoPago{

    @Override
    public void procesarPago(double monto) {
        if (validarMonto(monto)){
            System.out.println("Pago de "+monto+" procesado con criptomoneda");
        } else {
            System.out.println("Monto invalido para criptomoneda");
        }
    }

    @Override
    public String obtenerDetalles() {
        return "Se procesara pago por criptomonedas";
    }

    @Override
    public boolean validarMonto(double monto) {
        return monto >=0.001;
    }

}
