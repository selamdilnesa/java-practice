public class Recursion {
    static int power(int n ,int m){
        if(m==0){
            return 1;
      } else if(n==1){
            return 1;
        }
        else{
            return n*power(n,m-1);
        }
    } 
    public static void main(String[] args) {
        int number = 5;
        int result = power(number, 3);
        System.out.println("The power of " + number + " raised to the 3rd power is: " + result);
     }}