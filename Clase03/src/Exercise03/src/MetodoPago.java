public interface MetodoPago {

    void procesarPago();
    String obtenerDetalles();
    boolean validarMonto(double monto);
    

}
