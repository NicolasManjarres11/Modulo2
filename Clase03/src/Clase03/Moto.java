package Clase03;

public class Moto implements Vehiculo{

    @Override
    public void move() {
        System.out.println("Se mueve sobre 2 ruedas");
    }

    @Override
    public int obtainVelocity() {
        return 120;
    }

    @Override
    public void changeGear(int change) {
        // TODO Auto-generated method stub
        System.out.println("Se cambio a "+change+" marcha");
    }

    public void stunt(){
        System.out.println("Se mueve sobre una rueda");

    }

}
