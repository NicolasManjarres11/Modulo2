package RetoBasse;

public class Robo extends Emergencia implements Responder{

    //Constructor en base a la clase Emergencia

    public Robo(String tipo, String ubicacion, int nivelGravedad, int tiempoRespuesta) {
        super(tipo, ubicacion, nivelGravedad, tiempoRespuesta);
    }

    @Override
    public void atenderEmergencia() {
        System.out.println("Policia en camino");
    }

    @Override
    public void evaluarEstado() {
        System.out.println("Validar seguridad");
    }

}
