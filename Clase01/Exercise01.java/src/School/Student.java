package School;

public class Student {
    
    String name;
    int age;
    double media;

    //Constructor vacío

    public Student(){

        name = "N/A";
        age= 0;
        media = 0;

    }
    

    
    //Constructor con parámetros

    public Student(String name, int age, double media) {
        this.name = name;
        this.age = age;
        this.media = media;
    }

   public void showInfo(){

    System.out.println("\nNombre: "+name);
    System.out.println("Edad: "+age);
    System.out.println("Promedio: "+media);

   }

   public boolean isAprobbed(){
        return media >= 3.0;
   }

}
