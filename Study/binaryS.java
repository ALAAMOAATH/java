import java.lang.Math;
class binaryS {
    public static int binary(int array[],int target){
        int min = 0 ;
        int max =array.length;
        while (max>min){
            int mid = (int) Math.floor((max+min)/2);
            if(target==array[mid]){
                return mid+1 ;
            } 
            else if (target>array[mid]){
                min = min+1;
            }else{
                max=mid;
            }

        }
        return 0;

    }
    public static void main(String[] args) {
        int[] test ={1,2,3,4,5,6,7,8,9};
        System.out.println(binary(test,1));

    }
}