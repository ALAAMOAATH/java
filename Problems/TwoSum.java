import java.lang.reflect.Array;
import java.util.Arrays;

class TwoSum{
    public int[] twoSum(int[] nums, int target) {
        int result[]=new int[2] ;
        for (int i=0;i<nums.length;++i){
        for(int n=1;n<nums.length;++n){
                if(nums[n]+nums[i]==target){
                    if(i==n){
                        continue;
                    }
                    result[0] =i;
                    result[1]=n ;
                    return result ;
                }
            
            }

        }
        return result ;
        }

        public static void main(String[] args) {
            TwoSum alaa = new TwoSum();
            int[] test = {2,7,3};
            System.out.println(Arrays.toString(alaa.twoSum(test, 9)) );          
        
        
        
        }}