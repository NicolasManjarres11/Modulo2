package abstractas;

public class Perro extends Animal{

    @Override
    void hacerSonido() {
        System.out.println("Ladrandooo");
    }
    
    void rascarse(){
        System.out.println("Rascandose");
    }

}
