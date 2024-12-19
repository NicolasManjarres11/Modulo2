package RetoBasse;

public class Incendio extends Emergencia implements Responder{

    //Constructor en base a la clase Emergencia

    public Incendio(String tipo, String ubicacion, int nivelGravedad, int tiempoRespuesta) {
        super(tipo, ubicacion, nivelGravedad, tiempoRespuesta);
    }

    @Override
    public void atenderEmergencia() {
        System.out.println("Bomberos en camino");
    }

    @Override
    public void evaluarEstado() {
        System.out.println("Validar edificio");
    }

}
