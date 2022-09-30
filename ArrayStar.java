import java.util.Scanner;

class ArrayStar {
public static void main(String[] args) throws Exception {

//static array 
/*String array[][]= {
{"*","*","*","*","*","*"},
{"*"," "," "," "," ","*"},
{"*"," "," "," "," ","*"},
{"*","*","*","*","*","*"}   };*/


try (//dynamic array
Scanner input = new Scanner(System.in)) {
    System.out.println("enter the row : ");
    int i=input.nextInt();
    System.out.println("enter the colum : ");
    int j=input.nextInt();
    
    String array[][]=new String[i][j];
    for (int n=0 ; n<i ;n++ ){
        for (int k=0 ; k<j ;k++ )
            if (n==0||n==i-1||
               (!(n==0||n==i-1)&&(k==0||k==j-1)) ){
                 array[n][k]="*";
                // System.out.print("*");
            }else{
                 array[n][k]=" "; 
                // System.out.print(" ");
        }
        //System.out.println(" ");
    
        
    }
    
    System.out.println("in array :\n");
    for (int n=0 ; n<i ;n++ ){
        for (int k=0 ; k<j ;k++ ){
            System.out.print(array[n][k]);   
    
    
        }System.out.println(" ");
    }
}



}


 

// for print static array 
/*for (int i=0;i<array.length;i++){
    for(int n=0;n<array[i].length;n++){
        System.out.print(array[i][n]);
    }
    System.out.println(" ");
}*/


} 