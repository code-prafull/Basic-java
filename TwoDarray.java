public class TwoDarray {
    public static void main(String[] args) {
        int [][] myArr = new int [2][3];
    myArr[0][0] = 9; 
    int[][] arr = {{2 ,90 ,8}, { 2 ,8,20 }};
    // System.out.println(arr[0].length);
     
    int i = 0;
    while ( i < arr.length) {
        int j = 0; 
        while ( j < arr[i].length){
            System.out.print(arr[i][j] + " ");
            j++;
        } 
        System.out.println();
        i++;



      }
 
    }
}
