public class parameter {
 
    public static void main(String[] args) {
       System.out.println(sumTwoNum(5, 3));
       System.out.println(sumTwoNum(10, 3));
       System.out.println(sumTwoNum(76, 3));
       System.out.println(sumTwoNum(97, 3));
    }
 
    public static int sumTwoNum(int first, int secound) {
       System.out.println("first number is " + first);
       System.out.println("secound number is " + secound);
       int sum = first + secound;
       return sum;
    }
 }
 
