
public class InheritanceEmployee {

    String name;
    int employeeId;
    double salary;

    // Parent class constructor
    InheritanceEmployee(String name, int employeeId, double salary) {
        this.name = name;
        this.employeeId = employeeId;
        this.salary = salary;
    }

    // Parent class method
    void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("ID: " + employeeId);
        System.out.println("Salary: " + salary);
    }

    // Child class
    static class Manager extends InheritanceEmployee {

        String department;
        double bonus;

        // Child class constructor
        Manager(String name, int employeeId, double salary,
                String department, double bonus) {

            super(name, employeeId, salary);

            this.department = department;
            this.bonus = bonus;
        }

        // Overriding parent method
        @Override
        void displayInfo() {
            super.displayInfo();

            System.out.println("Department: " + department);
            System.out.println("Bonus: " + bonus);
        }
    }

    // Main method
    public static void main(String[] args) {

        Manager m1 = new Manager("Selam", 101, 15000, "IT", 3000);

        m1.displayInfo();
    }
}
