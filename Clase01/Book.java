package Clase01;

public class Book {

    //Atributos
    
    String title;
    String author;
    int year;
    String gender;
    boolean isBusy;

    //Método constructor        vacio

    //Empieza a construir el objeto con los valores iniciales

    public Book(){

        title="Sin titulo";
        author="N/A";
        year = 0;
        gender="";
        isBusy = false;

    } 

    public Book(String title, String author, int year, String gender, boolean isBusy){

        this.title = title;  //Izquierda es globarl - derecha es parámetro
        this.author = author;
        this.year = year;
        this.gender = gender;
        this.isBusy = isBusy;

    }
    public Book(String title, String author, int year, String gender){

        this.title = title;  //Izquierda es globarl - derecha es parámetro
        this.author = author;
        this.year = year;
        this.gender = gender;
        this.isBusy = false;

    }

    public void showInfo(){
        System.out.println("Title: "+ title);
        System.out.println("Author: "+ author);
        System.out.println("Year: "+ year);
        System.out.println("Gender: "+ gender);
        System.out.println("isBusy: "+ isBusy);
    }

    public void getBook(){
        if(!isBusy){
            isBusy = true;
            System.out.println("El libro: "+title +" Ha sido prestado");
        } else {
            System.out.println("El libro: "+title +" ya esta prestado");
        }
    }

    public void returnbook(){
        if(isBusy){
            isBusy = false;
            System.out.println("El libro: "+title +" Ha sido devuelto");
        } else {
            System.out.println("El libro: "+title +" no ha sido devuelto");
        }
    }


}

