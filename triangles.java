public class triangles {
    public static void main(String[] args) {
        int num = 5 ;
        
     //90 triangle right
        for (int i=1;i<=num;i++){

            for(int j=1;j<=i;j++){
                System.out.print("*");

            }
    System.out.println(" "); // for new line after every row
        }
      

    //90 triangle left
        for (int i=1;i<=num;i++){
            for(int r=num;r>=i;r--){        
                System.out.print(" ");
                }
            for(int j=1;j<=i;j++){
                System.out.print("*");

            }
    System.out.println(" "); // for new line after every row
        }
     
//60 triangle  
for (int i=1;i<=num;i++){
    for(int r=num;r>=i;r--){        
        System.out.print(" ");
        }
    for(int j=1;j<=i;j++){
        System.out.print(j+" ");
                }
            
    System.out.println(" "); // for new line after every row
}

//inverse triangle 
for(int i=num;i>=1;i--){
    for (int j=1 ;j<=i;j++){
        System.out.print("* ");

    }
    System.out.println(" "); // for new line after every row
}


//inverse triangle 
for(int i=num;i>=1;i--){
    for (int n=num;n>i;n--){
        System.out.print(" ");
    }
    for (int j=1 ;j<=i;j++){
        System.out.print("* ");

    }
    System.out.println(" "); // for new line after every row
}




    }
}
