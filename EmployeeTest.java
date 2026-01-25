class Employee {
    public int salary() {
        return 30000;
    }
}

class Manager extends Employee {
    @Override
    public int salary() {
        return 60000;
    }
}

public class EmployeeTest {
    public static void main(String[] args) {
        Employee e = new Employee();
        Manager m = new Manager();

        System.out.println("Employee Salary: " + e.salary());
        System.out.println("Manager Salary: " + m.salary());
    }
}
