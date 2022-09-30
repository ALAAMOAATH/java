//package java ;
import java.util.Scanner;

public class Hw1{
/**
 * @param args
 */
public static void main(String[] args){
    try (Scanner input = new Scanner(System.in)) {
        int aCounter =0  ;int bCounter =0  ;int cCounter =0  ;int stop =0 ;
        
        while(true){
            System.out.println("Enter one letter : ");
            String get = input.next().toUpperCase();
            char   x   = get.charAt(0);
            
        
            switch(x){
                case 'A': 
                aCounter+=1 ; break;
                case 'B': 
                bCounter+=1 ; break;
                case 'C': 
                cCounter+=1 ; break;
                case 'Z':
                stop = 1    ; break ;
                default:
                System.out.println("please enter ('A','B','C')just or 'Z' for stop");


            }
            if (stop==1){
                break;
            }
        }
        System.out.println("Number of 'A' is : "+ aCounter);
        System.out.println("Number of 'B' is : "+ bCounter);
        System.out.println("Number of 'C' is : "+ cCounter);
    }
    

        

    }



}


