package Task2.Solution4;
public class Employee extends Person {
    public int employeeID;
    public double salary;
    Employee (String name, int age, int employeeID, double salary) {
        super(name, age);
        this.employeeID = employeeID;
        this.salary = salary;
    }
    public void printEmployee() {
        printPerson();
        System.out.println("EMPLOYEE ID: " + employeeID);
        System.out.println("SALARY: " + salary);
    }
}