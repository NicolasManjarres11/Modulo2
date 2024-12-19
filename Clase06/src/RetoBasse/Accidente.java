package RetoBasse;

public class Accidente extends Emergencia implements Responder{

    //Constructor en base a la clase Emergencia

    public Accidente(String tipo, String ubicacion, int nivelGravedad, int tiempoRespuesta) {
        super(tipo, ubicacion, nivelGravedad, tiempoRespuesta);
    }

    @Override
    public void atenderEmergencia() {
        System.out.println("Ambulancia en camino");
    }

    @Override
    public void evaluarEstado() {
        System.out.println("Validar signo vitales");
    }

}
