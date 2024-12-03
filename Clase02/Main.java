package Clase02;

public class Main {

    public static void main(String[] args) {

        Employee empleado1 = new Employee("Nicolas", 1564, 150000);
        
        
        System.out.println(empleado1.toString());

        empleado1.setSalary(0);
        System.out.println(empleado1.toString());

        


    }



}
