public class ContextoHabilidades {

    private Habilidad habilidad;

    public ContextoHabilidades(Habilidad habilidad){
        this.habilidad = habilidad;
    }

    public void poder(Habilidad habilidad){
        habilidad.usar();
    }

}
