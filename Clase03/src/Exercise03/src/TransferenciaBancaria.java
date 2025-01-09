public class TransferenciaBancaria implements MetodoPago{

    @Override
    public void procesarPago(double monto) {
        if (validarMonto(monto)){
            System.out.println("Pago de "+monto+" procesado con transferencia bancaria");
        } else {
            System.out.println("Monto invalido para transferencia bancaria");
        }
    }

    @Override
    public String obtenerDetalles() {
        return "Se procesa el pago por medio de transferencia bancaria";
    }

    @Override
    public boolean validarMonto(double monto) {
        
        return monto >= 10;

    }

}
