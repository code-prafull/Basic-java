
import java.util.*;
public class ArrayUtility{
    public static int[] inputArray() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Wellcome to Array sum and Avrage");
        System.out.println("Please enter the numbers of elements");
        int size = sc.nextInt();
        int [] nums = new int[size];
        int i = 0;
        while (i < size ) {
            System.out.println("please enter our elements no. " + (i+1)+ " ");
            nums[i] = sc.nextInt();
            i++;
        } 
    }
}