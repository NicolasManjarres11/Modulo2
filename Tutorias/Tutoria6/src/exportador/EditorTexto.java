package exportador;

public class EditorTexto {

    private Exportador estrategia;
    private String contenido;

    public EditorTexto(Exportador estrategia ){
        this.estrategia = estrategia;
    }

    public EditorTexto(Exportador estrategia, String contenido){
        this.estrategia = estrategia;
        this.contenido = contenido;
    }


    public EditorTexto(){

    }

    public EditorTexto(String contenido){
        this.contenido = contenido;
    }

    public void setStrategia(Exportador estrategia){
        this.estrategia = estrategia;
    }

    //Metodo para realizar la exportacion utilizando la estrategia actual
    public void exportar(){
        if(estrategia == null){
            System.out.println("Selecciona una estrategia de exportacion");
        } else {
            estrategia.exportar(contenido);
        }
    }



}
