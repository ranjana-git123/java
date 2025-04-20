public class PosNegNumber {
    public static void main(String[] args) {
        int[] mark = {-20,35,80,-14,100,-56};
        int i = 0; String Pos =""; String Neg = "";

        while (i < mark.length) {
            if (mark[i]>0){
                Pos += mark[i] + "\n";
            }else if (mark[i]<0){
                 Neg  += mark[i] + "\n";
            }
            i++;
        }
        System.out.println("postive number \n" +Pos );
        System.out.println("Negative number \n" +Neg);
            
    }
}
