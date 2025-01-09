public class Bike extends Vehicle{

    private boolean haveSideCar;

    public Bike (String brand, int model, double maxVel, boolean haveSideCar){
        super(brand, model, maxVel);
        this.haveSideCar = haveSideCar;
    }

    public boolean isHaveSideCar() {
        return haveSideCar;
    }

    public void setHaveSideCar(boolean haveSideCar) {
        this.haveSideCar = haveSideCar;
    }

    @Override
    public String toString() {
        return super.toString()+" Bike [¿Tiene SideCar?=" + haveSideCar + "]";
    }





    

}
