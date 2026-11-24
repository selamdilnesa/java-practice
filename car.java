public class car{
 String brand ;
 String model ;
 int year ;
 double price ;
 car(String brand,String model,int year,double price){
    this.brand=brand;
    this.model=model;
    this.year=year;
    this.price=price                ;
 }
 void displayInfo(){
    System.out.println("Brand: " + brand);
    System.out.println("Model: " + model);
    System.out.println("Year: " + year);
    System.out.println("Price: " + price);
 }
 public static void main(String[] args) {
    car myCar1= new car("Toyota", "Camry", 2020, 25000.0);
    car myCar2= new car("Honda", "Civic", 2021, 20000.0);
    myCar1.displayInfo();
    myCar2.displayInfo();
 }
}
