public class App {
    public static void main(String[] args) throws Exception {
        SuperHeroe heroe1 = new SuperHeroe("Superman", new Volar());

        heroe1.agregarHabilidad(new LanzarRayos());
        heroe1.agregarHabilidad(new Velocidad());

        heroe1.imprimir();
    }
}
