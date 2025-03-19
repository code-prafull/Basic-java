public class ArraySumAvrage {
    public static void main(String[] args) {
        System.out.println("Wellcome to Array sum and Avrage");
        int[] numArray = ArrayUtility.inputArray();
        long sum =sum(numArray);
        int Avrage = Avrage(numArray);
        System.out.println(" Sum of the number is: " + sum);
        System.out.println("Avrage of the numbers is: " + Avrage);

    }
      
   public static long sum (int [] numArray) { 
    long sum = 0;
       int  i = 0;
       while (i < numArray.length) {
        sum += numArray[i];
        i++;

       }


    return sum;

   }
   public static int Avrage(int[] numArray) {
    long sum = sum(numArray);
 
   return (int) (sum / numArray.length) ;

   }
}