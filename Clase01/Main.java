package Clase01;

public class Main {

    public static void main(String[] args) {
        Book libro = new Book();
        Book libro2 = new Book("Cien años de soledad","Gabriel Garcia MArquez", 1968,"Realismo Magico");
        Book libro3 = new Book("Don Quijote de la mancha", "Miguel de Cervantes", 1688,"Magia",false);
        libro.title = "El aro";
        libro3.getBook();

        System.out.println("++++++++++++++++++++++++++");
        libro.showInfo();
        System.out.println("++++++++++++++++++++++++++");        
        libro2.showInfo();
        System.out.println("++++++++++++++++++++++++++");
        libro3.showInfo();
        System.out.println("++++++++++++++++++++++++++");
        libro3.getBook();
        libro3.returnbook();
        libro3.getBook();

    }



}
