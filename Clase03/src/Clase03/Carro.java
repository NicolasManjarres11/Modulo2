package Clase03;

public class Carro implements Vehiculo {

    @Override
    public void move() {

        System.out.println("Se mueve sobre 4 ruedas");

    }

    @Override
    public int obtainVelocity() {
        return 80;
    }

    @Override
    public void changeGear(int change) {

        System.out.println("Se cambio a "+change+" marcha");
    }

    

}
