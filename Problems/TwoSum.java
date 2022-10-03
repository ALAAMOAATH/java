class TwoSum{
    public static void main(String[] args) {
        int [] array={0,1,2,3};
        int target = 5 ;


        for (int i=0;i<array.length;++i){
            for(int n=0;n<array.length;++n){
                if(array[n]+array[i]==target){
                    System.out.println("["+i+","+n+"]");
                    break;
                }
            }
        }














        }
    }
