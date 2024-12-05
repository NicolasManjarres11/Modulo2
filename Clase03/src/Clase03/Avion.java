package Clase03;

public class Avion implements Vehiculo{

    @Override
    public void move() {

        System.out.println("El avion vuela");

    }

    @Override
    public int obtainVelocity() {
        return 300;
    }

    @Override
    public void changeGear(int change) {
        
        System.out.println("Se cambio a "+change+" marcha");

    }
    


}
