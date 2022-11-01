package ch03.ex01;

public class ex01 {
    public static void main(String[] args) {
         Measurable[] measurables = {
            new Employee("Maria", 1000.0),
            new Employee("João", 1500.0),
            new Employee("Eduardo", 1400.0),
            new Employee("Augusto", 1800.0),
            new Employee("José", 2500.0),
            new Employee("Joaquim", 900.0)
         };
         
         System.out.printf("Salary average: $%.2f.%n", Measurable.average(measurables));
         
         Employee largestSalary = (Employee) Measurable.largest(measurables);
         System.out.println( largestSalary.getName() + " has the largest salary.");

    }
}

interface Measurable {
    double getMeasure();

    static double average(Measurable[] objects){
        double sum = 0;
        for (Measurable object : objects) {
            sum += object.getMeasure();
        }
        return sum/objects.length;
    }

    static Measurable largest(Measurable[] objects){
        Measurable max = objects[0];
        for (Measurable o : objects) {
            if (o.getMeasure()>max.getMeasure()) {
                max = o;
            }
        }        
        return max;
    }
    
}

class Employee implements Measurable {

    private String name;
    private double salary;

    @Override
    public double getMeasure() {        
        return this.salary;
    }    

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    
    
}
