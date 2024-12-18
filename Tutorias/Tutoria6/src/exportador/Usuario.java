package exportador;

public class Usuario {

    public static void main(String[] args) {
        EditorTexto editor = new EditorTexto("Este es el contenido del texto");

        editor.setStrategia(new ExportarPDF());
        editor.exportar();
        editor.setStrategia(new ExportarHTML());
        editor.exportar();
        editor.setStrategia(new ExportarDOCX());
        editor.exportar();
    }

}
