import java.util.Arrays;

class TowerofHanoi{
    public static void Hanoi(){
        int start[]={1,2,3};
        int[] mid = new int[3] ;
        int[] goal = new int[3] ;
        //System.out.println("before start game  : ");
        //System.out.println("Start : "+Arrays.toString(start));System.out.println("middle : "+Arrays.toString(mid));System.out.println("goal : "+Arrays.toString(goal));
        goal[0]= start[0] ;
        start[0]=0;
        for (int i =1 ; i<3 ; ++i){
            if( start[i]!=0 && (start[i]<goal[i-1] || goal[i-1]==0) ){
                goal[i]= start[i] ;
                start[i]=0;
                System.out.println("Start : "+Arrays.toString(start));System.out.println("middle : "+Arrays.toString(mid));System.out.println("goal : "+Arrays.toString(goal));
            }else{
                mid[i]= start[i] ;
                start[i]=0;
                mid[i-1]=goal[i-1];
                goal[i-1]=0;
                
                System.out.println("Start : "+Arrays.toString(start));System.out.println("middle : "+Arrays.toString(mid));System.out.println("goal : "+Arrays.toString(goal));
            

            }
        }

    }

    public static void Hanoi2() {
        int start[]={1,2,3};
        int[] mid = new int[3] ;
        int[] goal = new int[3] ;
        int TS =start[0];
        int TM =mid[0];
        int TG =goal[0];
        for(int i=0;i<3;++i){
            if(TS>0 && TG==0){
                goal[i]=TG=start[i];
                TS=start[i+1];
                start[i]=0;
                System.out.println("Start : "+Arrays.toString(start));System.out.println("middle : "+Arrays.toString(mid));System.out.println("goal : "+Arrays.toString(goal));
            
            }else if (TS>0 && TS<TG){
                goal[i]=TG=start[i];
                TS=start[i+1];
                start[i]=0;
                System.out.println("Start : "+Arrays.toString(start));System.out.println("middle : "+Arrays.toString(mid));System.out.println("goal : "+Arrays.toString(goal));
            
            }else{
                mid[i]=TM=start[i];
                TS=start[i+1];
                start[i]=0;
                System.out.println("Start : "+Arrays.toString(start));System.out.println("middle : "+Arrays.toString(mid));System.out.println("goal : "+Arrays.toString(goal));
            
            }
        }

        
    }

    
    public static void main(String[] args) {
        Hanoi2();

    }
}