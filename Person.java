public class Person {
    private String name;
    private int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

class Student extends Person {
    private int studentId;
    private double GPA;

    Student(String name, int age, int studentId, double GPA) {
        super(name, age);
        this.studentId = studentId;
        this.GPA = GPA;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public double getGPA() {
        return GPA;
    }

    public void setGPA(double GPA) {
        this.GPA = GPA;
    }

    @Override
    void displayInfo() {
        super.displayInfo();
        System.out.println("Student ID: " + studentId);
        System.out.println("GPA: " + GPA);
    }
}

class GraduateStudent extends Student {
    private String researchTopic;
    private double scholarship;

    GraduateStudent(String name, int age, int studentId,
                    double GPA, String researchTopic, double scholarship) {

        super(name, age, studentId, GPA);
        this.researchTopic = researchTopic;
        this.scholarship = scholarship;
    }

    public String getResearchTopic() {
        return researchTopic;
    }

    public void setResearchTopic(String researchTopic) {
        this.researchTopic = researchTopic;
    }

    public double getScholarship() {
        return scholarship;
    }

    public void setScholarship(double scholarship) {
        this.scholarship = scholarship;
    }

    @Override
    void displayInfo() {
        super.displayInfo();
        System.out.println("Research Topic: " + researchTopic);
        System.out.println("Scholarship: " + scholarship);
    }
    public static void main(String[] args) {
    GraduateStudent s1 = new GraduateStudent(
        "Selam", 20, 1205, 3.9,
        "Artificial Intelligence", 15000
    );

    s1.displayInfo();
}
}