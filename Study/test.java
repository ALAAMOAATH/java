import javax.swing.JOptionPane;
public class test {
  public static void main(String[] args) {
    String A[][] = new String[3][3];
    for(int i=0;i<3; ++i){
        for(int n=0 ;n<3 ; ++n){
            A[i][n]= JOptionPane.showInputDialog("enter A["+i+"] ["+n+"]");
         }}       
    String tem = "";
    for(int i=2;i>=0; --i){
        for(String item:A[i]){
            tem+=item;
            tem+=" ";
         }
         tem+="\n";
            }
            JOptionPane.showMessageDialog(null,tem );
  }
}