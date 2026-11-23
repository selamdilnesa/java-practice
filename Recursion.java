public class Recursion {
    static int sum(int n){
        if(n==0){
            return 0;

        } else if(n==1){
            return 1;
        }
        else{
            return sum(n-1)+sum(n-2);
        }
    } 
    public static void main(String[] args) {
        int number = 5;
        int result = sum(number);
        System.out.println("The sum of first " + number + " natural numbers  is: " + result);
     }}