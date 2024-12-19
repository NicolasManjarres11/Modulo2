public interface Nadador {

    public static String estilo = "Libre";

    void nadar();

    default void chapuzon(){
        System.out.println("Entrando al agua");
    }

    static void patear(){
        System.out.println("Patada");
    }

}
