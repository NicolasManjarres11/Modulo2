package School;

import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {

        ArrayList<Student> students = new ArrayList<>();

        students.add(new Student("Nicolas",25,4.0));
        students.add(new Student("Dayana",22,5.0));
        students.add(new Student("Kratos", 50,2.0));
        students.add(new Student("Kira",16,3.0));
        students.add(new Student("Mailo",30,2.9));
        
        for (Student student : students) {
            student.showInfo();
            if(student.isAprobbed()){
                System.out.println("Estudiante aprobado");
            } else {
                System.out.println("Estudiante no aprobado");
            }
        }

    }
}
