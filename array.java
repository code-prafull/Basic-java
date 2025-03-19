import java.util.Scanner;

public class array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {2, 8, 89, 98, 87, 89, 4,6,8,}; 
        System.out.println("Wellcome the Array Sarching");
        System.out.println("Please enter your number");
        int num = sc.nextInt();     
        boolean isFound = isFound(arr, num);
        if (isFound){
            System.out.println(" your number is present in array list");
        } else {
            System.out.println("your number is not found in array list");
        }
    }

    public static boolean isFound(int[] arr, int num) {
        int index = 0;
        while (index < arr.length) { 
            if (arr[index] == num ) 
            return true ; 
            index ++; }
        return false;
}

}













