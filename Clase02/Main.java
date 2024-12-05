package Clase02;

public class Main {

    public static void main(String[] args) {

        Employee empleado1 = new Employee("Nicolas", 1564, 150000);
        Employee empleado2 = new Employee("Manjarres", 5454, 150000);
        Manager gerente1 = new Manager("manja",1125,2450000,"DEV");
        
        
        System.out.println(empleado1.toString());
        empleado1.increaseSalary(10);
        System.out.println(empleado1.toString());

        empleado1.setSalary(0);
        System.out.println(empleado1.toString());
        System.out.println(empleado1.hashCode());
        System.out.println();
        System.out.println(gerente1.toString());

        


    }



}
