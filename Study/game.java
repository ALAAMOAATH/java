import java.util.Scanner;

class game {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int x = (int)(Math.random()*10);
        System.out.println("for easy:3 med :2 hard: 1");
        int z = input.nextInt();
        if(z==1){
            z=2;
        }else if (z==2){
            z=4;
        }else{
            z=10;
        }
        
        for(int i=0 ;i<z ;++i ){
            System.out.println("enter a num ");
            int y = input.nextInt();

            if (y==x){
                System.out.println("great you get it ");
                break;
            }else if (y>x)  {
                System.out.println("try again with smaller num");

            }else{
                System.out.println("try again with bigger num");
            }
        }
        

    }
}