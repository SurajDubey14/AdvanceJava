package Lab2;


 class User {
    // Properties
    int id;
    String name;

    // Parameterized constructor
    public User(int id, String name) {
        this.id = id;
        this.name = name;
    }
}

class Employee extends User {
    // Additional properties
    double salary;

    // Parameterized constructor for Employee
    public Employee(int id, String name, double salary) {
        // Call the constructor of the superclass (User)
        super(id, name);
        this.salary = salary;
    }

    // Method to calculate annual salary
    public double calculateAnnualSalary() {
        return salary * 12; // Assuming salary is monthly 
    }
}

public class SalaryCalculator {
    public static void main(String[] args) {

        // Create an object of Employee class using the constructor

        Employee employee = new Employee(1, "John Doe", 5000.0);

        // Calculate and display the annual salary of the employee

        double annualSalary = employee.calculateAnnualSalary();
        System.out.println("Employee Name: " + employee.name);
        System.out.println("Employee Annual Salary: $" + annualSalary);
    }
}
