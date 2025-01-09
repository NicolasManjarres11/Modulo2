public class Car extends Vehicle{

    private int numDoors;

    public Car(String brand, int model, double maxVel, int numDoors){
        super(brand,model,maxVel); //Atributos de la clase general
        this.numDoors = numDoors; //Atributos de la clase heredada de la general
    }


    public int getNumDoors() {
        return numDoors;
    }

    public void setNumDoors(int numDoors) {
        this.numDoors = numDoors;
    }


    @Override
    public String toString() {
        return super.toString()+" Carro [numero de puertas =" + numDoors + "]";
    }

    

    

}
