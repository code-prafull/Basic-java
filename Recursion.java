import java.util.Scanner;
public class Recursion {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
         System.out.println("Welcome to factorial checker ");
         System.out.println("Please enter your Factorial");
         int num = input.nextInt();
         long fact = Factorial(num);
         System.out.println("your Factorial is " + fact);

    }     

        public static long Factorial(int num) {
            if (num == 1) {
                return 1;
            }
            return num * Factorial(num - 1);
        }




    public static long FactorialCheck(int num){
        long result = 1;
        for(int i =1; i<=num; i++){
            result *= i;
        }

        return result;

    }




}