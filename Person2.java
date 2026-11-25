public class Person2 {
    String name;
    int age;

    // Person constructor
    Person2(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Original display method
    void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

    static class Employee extends Person2 {
        int employeeId;
        double salary;

        // Employee constructor
        Employee(String name, int age, int employeeId, double salary) {
            super(name, age);
            this.employeeId = employeeId;
            this.salary = salary;
        }

        // Method overriding
        @Override
        void displayInfo() {
            super.displayInfo();
            System.out.println("Employee ID: " + employeeId);
            System.out.println("Salary: " + salary);
        }

        static class Manager extends Employee {
            String department;
            double bonus;

            // Manager constructor
            Manager(String name, int age, int employeeId, double salary,
                    String department, double bonus) {

                super(name, age, employeeId, salary);
                this.department = department;
                this.bonus = bonus;
            }

            // Method overriding
            @Override
            void displayInfo() {
                super.displayInfo();
                System.out.println("Department: " + department);
                System.out.println("Bonus: " + bonus);
            }
        }
    }

    public static void main(String[] args) {

        Employee.Manager m1 = new Employee.Manager(
                "Selam", 20, 101, 25000, "IT", 5000
        );

        m1.displayInfo();
    }
}