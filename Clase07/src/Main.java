
import java.util.ArrayList;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) throws Exception {
        Alarmas alarma1 = new Alarmas("QWERTY12345");

        alarma1.getCodigo();

        Alarmas.SensorHumo sensorCocina =alarma1.new SensorHumo("67386374", "cocina");
        Alarmas.SensorHumo sensorSala =alarma1.new SensorHumo("82638496", "sala");

        sensorCocina.detectarHumo();
        sensorSala.lanzarAlerta();

        Notificacion notificacionEmail = new Notificacion() {
            @Override

            public void enviar(String mensaje){
                System.out.println("Envio de email: "+ mensaje);
            }

        };

        notificacionEmail.enviar("Reunion para mañana");

        Timer temporizador = new Timer();

        temporizador.schedule(new TimerTask(){

            private int contador = 0;
            private final String mensaje = "Tu puedes sigue asiiiii";

            @Override
            public void run(){
                System.out.println(mensaje);
                if(contador == 0) {
                    temporizador.cancel();
                }
            }

        },0,1000);
    
        //Lambda

        Operation suma = (x,y) -> x + y;

        suma.ejecutar(10, 7);

        List<String> palabras = new ArrayList<>();

        palabras.add("Nicolas");
        palabras.add("Hola?");
        palabras.add("bye bye");

        List<String> filtradas = palabras.stream().filter(palabra -> palabra.endsWith("?")).collect(Collectors.toList()); 

    }
}


