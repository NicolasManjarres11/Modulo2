package abstractas;

//Clase abstracta
abstract  class Animal { 

    private String raza;

    //metodo abstracto

    abstract void hacerSonido();

    //metodo concreto
    void dormir(){
        System.out.println("Durmiendo....");
    }

}
