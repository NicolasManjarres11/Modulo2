package Clase03;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Vehiculo> vehicles = new ArrayList<>(); //Va creciendo a medida que vamos metiendo  valores
        vehicles.add(new Carro());
        vehicles.add(new Avion());
        vehicles.add(new Moto());
        System.out.println(vehicles);

        for(Vehiculo vehiculo : vehicles){

            vehiculo.move();

        }
    }
}
