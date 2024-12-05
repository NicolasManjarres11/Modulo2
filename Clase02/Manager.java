package Clase02;

public class Manager extends Employee{

    private String department;

    public Manager(String name, int id, double salary, String department) {
        super(name, id, salary); //atributos de clase general
        this.department = department; //atributo de clase especifica
    }

    

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return super.toString()+"[department=" + department + "]";
    }



    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    

}