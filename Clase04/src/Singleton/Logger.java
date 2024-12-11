package Singleton;
public class Logger {
    
    private static Logger instancia;  //variable

    //Constructor

    private Logger(){

    }

    //Se garantiza que haya una unica instancia
    public static Logger getInstancia(){
        if(instancia == null){
            instancia = new Logger(); //Se instancia clase
            }
        return  instancia;
    }

    public void log(String message){
        System.out.println("[LOG]: "+message);
    }

}
