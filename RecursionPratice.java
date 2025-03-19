import java.util.Scanner;
 public class RecursionPratice{
 public static void main(String[] args) {
  Scanner input = new Scanner(System.in);
  System.out.println("wwelcome to prim number checker");
  System.out.println("Enter a number to check if it is prime or not");
  int num = input.nextInt();
  boolean isprime = isprime(num);
  System.out.println("Your number is " + (isprime(num) ? "prime" : "not prime"));
 
  

  }


  public static boolean isprime(int num){
    for (int i = 2; i<num; i++){
      if (num % i ==0){
        return false ;
      }
    }
    return true;
  





















}





























}