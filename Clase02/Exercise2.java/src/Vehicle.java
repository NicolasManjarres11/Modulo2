public class Vehicle {

    private String brand;
    private int model;
    private double maxVel;

    //Constructor con atributos

    public Vehicle(String brand, int model, double maxVel){

        this.brand = brand;
        this.model = model;
        this.maxVel = maxVel;

    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getModel() {
        return model;
    }

    public void setModel(int model) {
        this.model = model;
    }

    public double getMaxVel() {
        return maxVel;
    }

    public void setMaxVel(double maxVel) {
        this.maxVel = maxVel;
    }

    //show details

    @Override
    public String toString() {
        return "Vehiculo [Marca= " + brand + ", Modelo =" + model + ", Velocidad maxima=" + maxVel + "]";
    }




}
