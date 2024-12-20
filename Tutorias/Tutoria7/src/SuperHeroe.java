
import java.util.ArrayList;
import java.util.List;

public class SuperHeroe {

    private String nombre;
    private List<Habilidad> habilidades;
    /* private Habilidad habilidad; */

    public SuperHeroe(String nombre, Habilidad habilidad){
        this.nombre = nombre;
        habilidades = new ArrayList<>();
        habilidades.add(habilidad);
    }

    public void agregarHabilidad(Habilidad habilidad){
        habilidades.add(habilidad);
    }

    public void imprimir(){
        System.out.println("Nombre: "+this.nombre);

        for (Habilidad habilidad : habilidades){
            habilidad.usar();
            System.out.println();
        }
    }


}
