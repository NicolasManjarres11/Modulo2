public class App {
    public static void main(String[] args) throws Exception {
        Operacion suma = new Suma();
        Operacion resta = new Resta();
        Operacion multiplicar = new Multiplicar();

        System.out.println(suma.ejecutar(5,5));

        ContextoCalculadora calculadora = new ContextoCalculadora(multiplicar);

        System.out.println(calculadora.calcular(5,5));
    }
}
 