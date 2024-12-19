package RetoBasse;

public class Emergencia{

    private final String tipo;
    private final String ubicacion;
    //TODO: pasar a enum
    private final int nivelGravedad; ///Se puede utilizar el enum  //1. bajo 2. medio 3. alto
    private final int tiempoRespuesta;

    



    public Emergencia(String tipo, String ubicacion, int nivelGravedad, int tiempoRespuesta) {
        this.tipo = tipo;
        this.ubicacion = ubicacion;
        this.nivelGravedad = nivelGravedad;
        this.tiempoRespuesta = tiempoRespuesta;
    }


    public String getTipo() {
        return tipo;
    }


    public String getUbicacion() {
        return ubicacion;
    }


    public int getNivelGravedad() {
        return nivelGravedad;
    }


    public int getTiempoRespuesta() {
        return tiempoRespuesta;
    }


    @Override
    public String toString() {
        return "Emergencia [tipo=" + tipo + ", ubicacion=" + ubicacion + ", nivelGravedad=" + nivelGravedad
                + ", tiempoRespuesta=" + tiempoRespuesta + "]";
    }





}
