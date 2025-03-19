import java.util.Scanner;
 class Return {
    public static void main(String[] args) {
        int first = readNumber();
        int second = readNumber2();

        int sum = first + second;
        System.out.println(" your result is " + sum);
    }

    public static int readNumber() {
        Scanner sc = new Scanner(System.in);
        System.out.println("wellcome to calculator");
        System.out.println("please enter your first number");
        int first = sc.nextInt();
        return first;
    } 

    public static int readNumber2() {
        System.out.println("please enter your second number");
        int second =  sc.nextInt();
        return second;
        
    }
}
