public class triangles {
    public static void main(String[] args) {
        
        //90 triangle right
        int num = 5 ;
        for (int i=1;i<=num;i++){

            for(int j=1;j<=i;j++){
                System.out.print("*");

            }
            System.out.println("");
        }



        //90 triangle left
        for (int i=1;i<=num;i++){
            for(int r=num;r>=i;r--){        
                System.out.print(" ");
                }
            for(int j=1;j<=i;j++){
                System.out.print("*");

            }
            System.out.println("");
        }



    }
}
