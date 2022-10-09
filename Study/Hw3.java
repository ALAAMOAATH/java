import java.util.Arrays;
import java.util.Scanner;

public class Hw3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("please enter number of row :");
        int row = input.nextInt();
        
        System.out.println("please enter number of column :");
        int col = input.nextInt();

        int A[][] = new int[row][col];
        int B[][] = new int[row][col];


        for(int i=0,j=B.length-1;(i<row && j>=0); ++i,--j){
            for(int n=0 ;n<A[i].length ; ++n){
                //System.out.printf("Enter A[ % d ][ % d ]",i,j);
                System.out.println("enter A["+i+"] ["+n+"]");
                int element = input.nextInt();
                A[i][n]=element;
                B[j][n]=element;
            }
        } 
        
        System.out.println(Arrays.deepToString(A));
        System.out.println(Arrays.deepToString(B));



    }
}
