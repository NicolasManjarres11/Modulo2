package Singleton;

import Factory.Forma;
import Factory.FormaFactory;
import Factory.TipoForma;

public class App {

    public static void main(String[] args) {

        //Singleton
        
        Logger logger1 = Logger.getInstancia();  //Obtener instancia o instanciar con el metodo constructor de la clase
        Logger logger2 = Logger.getInstancia(); //El puntero del objeto al cual hace referencia es el mismo

        logger1.log("Se imprimio el primer paso");
        logger1.log("Se imprimio el segundo paso");
        logger1.log("Ejecucion completada");


        //Factory

        //Está la clase Forma, tenemos la clase centralizada que instancia las demás clases, y le pasamos como parámetro un objeto tipo forma, el cual tenemos controlado o parametrizado bajo un enum

        Forma forma1 = FormaFactory.getForma(TipoForma.CIRCULO);
        forma1.dibujar();
        Forma forma2 = FormaFactory.getForma(TipoForma.RECTANGULO);
        forma2.dibujar();
        Forma forma3 = FormaFactory.getForma(TipoForma.TRIANGULO);
        forma3.dibujar();

    }

}
