public class ContextoCalculadora {
    
    private Operacion operacion;

    //Constructor

    public ContextoCalculadora(Operacion operacion){
        this.operacion = operacion;
    }

    public double calcular(double a, double b){
        return operacion.ejecutar(a, b); //Este metodo se ejecuta de acuerdo al contexto
    }

}
