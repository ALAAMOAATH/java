import java.util.Scanner;

public class Algorithm {
    public static String HireAdriver(Boolean drive ,int age){
        if (drive==true && age>21){
            return "Hired";
        }
        else{
            return "rej";
        }

    }



    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("plese neter a num : ");
        int n = input.nextInt();
        int result = 0 ;

        for(int i=1;i<=n ; ++i){
            if( (i%2)!=0){
                result+=i;
            }
        }
        System.out.println(result);

    }
}
