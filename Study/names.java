public class names {
    public static void main(String[] args) {
    /*String alaa [][]=
    {
        {" "," "," "," ","*","*","*"," "," "," ","*"," "," "," ","*"," "," "," ","*","*","*","*"},
        {" "," "," "," ","*"," "," "," "," "," "," ","*"," "," ","*"," "," "," "," ","*"},
        {" "," "," "," ","*"," "," "," "," "," "," "," ","*"," ","*"," "," "," "," "," ","*"},
        {" "," ","*","*","*"," "," "," ","*"," ","*"," ","*","*","*"," ","*"," ","*"," ","*","*"}
};*/

String ruaa [][]=
    {
        {"* ","* ","* "," "," "," "," "," ","","*"," "," "," "," "," *","   *","*","**** "," "," ******"},
        
        {"* "," "," ","* "," "," "," "," "," ","*"," "," "," "," "," *","  *"," "," ","    * ","*      *"},
        
        {"*","**","* "," "," "," "," "," "," ","*"," "," "," "," "," *","  *","*","*","***** ","********"},
        
        {"* "," ","* "," "," "," "," "," "," ","*"," "," "," "," "," *","  *"," ","     * ","*      *"},
        
        {"* "," "," ","* "," "," "," "," "," ","*"," "," "," "," "," *","  *","      * ","","","*      *"},
        
        {"* "," "," "," ","* "," "," "," "," ","*"," *"," *"," *"," "," ","*","      *"," ","*      *"},
};
    for (int i=0;i<ruaa.length;i++){
        for(int n=0 ;n<ruaa[i].length;n++){
            System.out.print(ruaa[i][n]);
        }System.out.println("");
    }
    }
}
