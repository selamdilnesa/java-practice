import java.util.Scanner;
public class For {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        for (int i = 1; i <= 20; i++) {
            System.out.println(i);
        }
      for (int i=1;i%2==0;i++){
        System.out.println(i);
      }
    System.out.println("Enter a number:");
    int number = input.nextInt();
    for (int i=1; i<=10; i++){
        System.out.println(number + " x " + i + " = " + (number * i));
    }
    int factorial = 1;
    System.out.println("Enter a number to calculate its factorial:");
    int num = input.nextInt();
    for (int i = 1; i <= num; i++) {
        factorial *= i;
    }
    System.out.println("The factorial of " + num + " is: " + factorial);
    input.close();

    }
    
}
