import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter food number:");
        System.out.println("1. Pizza");
        System.out.println("2. Burger");
        System.out.println("3. Pasta");
        System.out.println("4. Sandwich");
        System.out.println("5. Juice");

        int food = input.nextInt();

        System.out.println("Enter quantity:");
        int quantity = input.nextInt();

        int price = 0;
        String foodName = "";

        if (food < 1 || food > 5 || quantity <= 0) {

            System.out.println("Invalid input");

        } else {

            switch (food) {

                case 1:
                    foodName = "Pizza";
                    price = 500;
                    break;

                case 2:
                    foodName = "Burger";
                    price = 300;
                    break;

                case 3:
                    foodName = "Pasta";
                    price = 400;
                    break;

                case 4:
                    foodName = "Sandwich";
                    price = 200;
                    break;

                case 5:
                    foodName = "Juice";
                    price = 100;
                    break;
            }

            int total = price * quantity;

            System.out.println("Food: " + foodName);
            System.out.println("Price: " + price);
            System.out.println("Quantity: " + quantity);
            System.out.println("Total: " + total + " birr");
        }

        input.close();
    }
}