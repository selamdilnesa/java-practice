import java.util.Scanner;

public class Ifelse {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Number of nights:");
        int nights = input.nextInt();

        System.out.println("Number of guests:");
        int guests = input.nextInt();

        System.out.println("Room type: (1) Standard (2) Deluxe (3) Suite");
        int roomType = input.nextInt();

        System.out.println("Do you have membership? (1=yes/0=no)");
        int hasMembership = input.nextInt();

        if (nights <= 0 || guests <= 0 ||
            roomType < 1 || roomType > 3 ||
            (hasMembership != 0 && hasMembership != 1)) {

            System.out.println("Invalid input");

        } else {

            double pricePerNight = 0;

            if (roomType == 1) {
                pricePerNight = 1500;
            } else if (roomType == 2) {
                pricePerNight = 2500;
            } else {
                pricePerNight = 4000;
            }

            int capacity = 0;

            if (roomType == 1) {
                capacity = 2;
            } else if (roomType == 2) {
                capacity = 4;
            } else {
                capacity = 6;
            }

            if (guests > capacity) {

                System.out.println("Room capacity exceeded");

            } else {

                double discount = 0;

                if (nights <= 2) {
                    discount = 0;
                } else if (nights <= 5) {
                    discount = 0.05;
                } else if (nights <= 10) {
                    discount = 0.10;
                } else {
                    discount = 0.15;
                }

                double originalPrice = nights * pricePerNight;

                double nightsDiscount = originalPrice * discount;

                double afterDiscount = originalPrice - nightsDiscount;

                double membershipDiscount = 0;

                if (hasMembership == 1) {
                    membershipDiscount = afterDiscount * 0.05;
                }

                double totalDiscount = nightsDiscount + membershipDiscount;

                double finalPayment = originalPrice - totalDiscount;

                System.out.println("Original price: " + originalPrice);
                System.out.println("Nights discount: " + nightsDiscount);
                System.out.println("Membership discount: " + membershipDiscount);
                System.out.println("Total discount: " + totalDiscount);
                System.out.println("Final payment: " + finalPayment);
            }
        }

        input.close();
    }
}