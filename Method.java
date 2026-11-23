import java.util.Scanner;

public class Method {
    
    static int square(int num){
        return num*num;
   };
   static int add(int num1, int num2){
        return num1+num2;
   }
   static void displayWelcome(){
        System.out.println("Welcome to java programming!");
   }
   static double calculateAverage(int num1, int num2, int num3){
        return (num1+num2+num3)/3.0;
   }
   static int product(int num1, int num2){
        return num1*num2;
   }
   static int product(int num1, int num2, int num3){
        return num1*num2*num3;
   }
   static double product(double num1, double num2){
        return num1*num2;
   }
   public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
        int result = square(5);
        System.out.println("Square of 5 is: " + result);
         System.out.println("Enter the first number:");
        int a = input.nextInt();
        System.out.println("Enter the second number:");
        int b = input.nextInt();
        int sum = add(a, b);
        System.out.println("Sum of " + a + " and " + b + " is: " + sum);

        displayWelcome();
        double average =calculateAverage(10, 20, 30);
        System.out.println("Average of 10, 20, and 30 is: " + average);
        int product1 = product(2, 3);
        System.out.println("Product of 2 and 3 is: " + product1);
        int product2 = product(2, 3, 4);
        System.out.println("Product of 2, 3, and 4 is: " + product2);
        double product3 = product(2.5, 3.5);
        System.out.println("Product of 2.5 and 3.5 is: " + product3);
    }
   
    
}
