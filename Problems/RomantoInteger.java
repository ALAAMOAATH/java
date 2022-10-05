import java.util.*;
class RomantoInteger{
    public static void main(String[] args) {

      //  Dictionary Roman = new Dictionary<K,V>() {
            
        //};
        
        int result = 0 ;
        String s ="MCMXCIV" ;

        for (int i = 0 ;i<s.length();++i ){
            if(s.charAt(i)<s.charAt(i+1)){
                result = s.charAt(i)-s.charAt(i+1) ;

            }else{
                result=s.charAt(i);
                break;
            }
        }
        System.out.println(result);

    }

}