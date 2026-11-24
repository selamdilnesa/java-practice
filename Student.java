public class Student {
    String name;
    int age;
    String department;
    double gpa;
    Student(String name ,int age, String department,double gpa){
        this.name=name;
        this.age=age;
        this.department=department;
        this.gpa=gpa;
    }
    void displayInfo(){
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Department: " + department);
        System.out.println("GPA: " + gpa);
    }
    void checkScholarship(){
        if(gpa>=3.5){
            System.out.println(name + " is eligible for scholarship.");
        }else{
            System.out.println(name + " is not eligible for scholarship.");
        }
    }
    public static void main(String[] args) {
        Student student1= new Student("John", 20, "Computer Science", 3.8);
        Student student2= new Student("Alice", 19, "Mathematics", 3.2);
        student1.displayInfo();
        student1.checkScholarship();
        System.out.println();
        student2.displayInfo();
        student2.checkScholarship();
    }
    
}
