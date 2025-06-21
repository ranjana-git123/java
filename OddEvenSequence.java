import java.util.Scanner;

public class OddEvenSequence{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter any number: ");
        String num = sc.next(); 
        
        String oddPart = "";
        String evenPart = "";
        
        
        for(int i =0;i<num.length();i++){
            int digit = num.charAt(i) -'0';
            if(digit%2 !=0){
                oddPart += digit;
            }
            else{
                evenPart += digit;
            }
        }
        
        String result = oddPart + evenPart;
        System.out.println("Output sequence: " + result);
        
    }
}

// Enter any number: 446752
// Output sequence: 754462
