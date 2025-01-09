

public class Employee {
    
        
        private String name;
        private int id;
        private double salary;

        
        public Employee(String name, int id, double salary) {
            this.name = name;
            this.id = id;
            this.salary = salary;
        }


        public String getName() {
            return name;
        }


        public void setName(String name) {
            this.name = name;
        }


        public int getId() {
            return id;
        }


        public void setId(int id) {
            this.id = id;
        }


        public double getSalary() {
            return salary;
        }


        public void setSalary(double salary) {
            if(salary >= 0){
                this.salary = salary;
            } else{
                System.out.println("El salario no puede ser menor a 0");
            }
        }


    public void increaseSalary(double percent){

        salary += (salary *percent/100);

        double valor = (percent > 0) ? salary : 130000 ; //operador ternario
        

    }


     @Override  //sobreescribir
    public String toString() {  //showThis
        return "Employee [name=" + name + ", id=" + id + ", salary=" + salary + "]";
    }


    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        result = prime * result + id;
        long temp;
        temp = Double.doubleToLongBits(salary);
        result = prime * result + (int) (temp ^ (temp >>> 32));
        return result;
    }


    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Employee other = (Employee) obj;
        if (name == null) {
            if (other.name != null)
                return false;
        } else if (!name.equals(other.name))
            return false;
        if (id != other.id)
            return false;
        if (Double.doubleToLongBits(salary) != Double.doubleToLongBits(other.salary))
            return false;
        return true;
    }

    



}


