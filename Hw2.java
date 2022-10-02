import javax.swing.JOptionPane;

class Hw2 {
    public static void main(String[] args) {
        String get = JOptionPane.showInputDialog("enter a num between 100 to 999 :");
        while(true){
           int check = Integer.parseInt(get); 
           if(check<=999 && check>=100){
                break;
           } else{
             get = JOptionPane.showInputDialog("just a num between 100 to 999 :");
           }
        }
           
    
    
    
    
        // n for one digit from the number we get
        int n1=(get.charAt(0)-'0') ; //'0' = 48 in ASCII  code so we sub it to get num value .
        int n2=(get.charAt(1)-'0') ;
        int n3=(get.charAt(2)-'0') ;    
        int result = n1 + n2 + n3 ;

    
        JOptionPane.showMessageDialog(null,n1 +"+"+n2+"+"+n3+" = "+result, "result", JOptionPane.INFORMATION_MESSAGE);

}
}