import java.util.Scanner;

public class OddEvenSeqCount{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter any number: ");
        String num = sc.next(); 
        
        String oddPart = "";
        String evenPart = "";
        int oddCount = 0;
        int evenCount = 0;
        
        
        for(int i =0;i<num.length();i++){
            int digit = num.charAt(i) -'0';
            if(digit%2 !=0){
                oddPart += digit;
                oddCount ++;
            }
            else{
                evenPart += digit;
                evenCount ++;
            }
        }
        
        String result = oddPart + oddCount + evenPart+evenCount;
        System.out.println("Output sequence: " + result);
        
    }
}

// Enter any number: 7564768
// Output sequence: 757364684
