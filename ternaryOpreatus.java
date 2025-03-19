import java.util.Scanner; class ternaryOpreatus {
public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("Wellcome to number Checker");
    System.out.println("Please Enter your First NUmber ");
    int num1 = input.nextInt();
    System.out.println("Please Enter your Second Number");
    int num2 = input.nextInt();
    // if (num1 > num2 ) {
    //     System.out.println(" your Grater number is " + num1);
    // } else {
    //     System.out.println(" your Grater number is " + num2);
    // }
    int greaterNumber = num1 > num2 ? num1 : num2;
    System.out.println("Your Grater Num is " + greaterNumber );

   }
}