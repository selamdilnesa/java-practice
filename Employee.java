public class Employee{
    private String name;
    private int employeeId;
    private double salary;
    Employee(String name,int employeeId,double salary){
        this.name=name;
        this.employeeId=employeeId;
        this.salary=salary;
    }
  public String getName(){
    return name;
  }
  public int getEmployeeId(){
    return employeeId;
  }
  public double getSalary(){
    return salary;
  }
  public void setName(String name){
    this.name = name;
}
  public void setSalary(double salary){
    if(salary>0){
        this.salary=salary;
    }else{
        System.out.println("Invalid salary!");
    }
  }
  public void increaseSalary(double amount){
    if(amount>0){
        salary+=amount;
    }else{
       System.out.println("invalid amount");
    }
  }
  public static void main(String[] args){
    Employee e1=new Employee("selam", 2, 2000);
    Employee e2=new Employee("melkit", 2, 100000);
  System.out.println(e1.getName());
System.out.println(e1.getEmployeeId());
System.out.println(e1.getSalary());
    e2.setName("abebe");
     e2.getName();
   System.out.println( e2.getEmployeeId());
   System.out.println( e2.getSalary());
    e2.increaseSalary(30000);
  }

}