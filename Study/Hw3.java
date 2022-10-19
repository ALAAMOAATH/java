import java.util.Arrays;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class Hw3 {
    /**
     * 
     */
    public static void HW3 (){
        try (Scanner input = new Scanner(System.in)) {
            System.out.println("please enter number of row :");
            int row = input.nextInt();
            
            System.out.println("please enter number of column :");
            int col = input.nextInt();

            int A[][] = new int[row][col];
            int B[][] = new int[row][col];



            for(int i=0,j=B.length-1;(i<row && j>=0); ++i,--j){
                for(int n=0 ;n<A[i].length ; ++n){
                    //System.out.printf("Enter A[%d][%d]",i,n);
                    System.out.println("enter A["+i+"] ["+n+"]");
                    int element = input.nextInt();
                    A[i][n]=element;
                    B[j][n]=element;
                }
                
            } 

            //output as Matrix ...
            System.out.println("The matrix you've enter :");
            for(int i=0;i<row; ++i){
            for(int item:A[i]){
                System.out.print(" " + item + " ");

            }
            System.out.println("");
        }

            System.out.println("The Matrix after change : ");
            for(int i=0;i<row; ++i){
            for(int item:B[i]){
                System.out.print(" " + item + " ");

            }
            System.out.println("");
        }

        


        //output as 2D array
        System.out.println("As Array:\n"+Arrays.deepToString(A)+"\n"+Arrays.deepToString(B));


        

        }catch(Exception InputMismatchException) {
            System.out.println("wrong input please enter integer just ...");
            

        }


    }
    public static void main(String[] args) {
        HW3();
    }
}
