public class App {
    public static void main(String[] args) throws Exception {
        
        Vehicle carro = new Car("Mazda", 2019, 300,5);
        Vehicle moto = new Bike("Suzuki", 2024, 125, false);
        System.out.println(carro.toString());
        System.out.println(moto.toString());

    }
}
