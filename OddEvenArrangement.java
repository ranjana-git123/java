import java.util.Scanner;

public class OddEvenArrangement{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter any number: ");
        String num = sc.next(); 
        
        String oddPart = "";
        String evenPart = "";
        int oddSum = 0;
        
        for(int i =0;i<num.length();i++){
            int digit = num.charAt(i) -'0';
            if(digit%2 !=0){
                oddPart += digit;
                oddSum += digit;
            }
            else{
                evenPart += digit;
            }
        }
        
        String result = oddPart + evenPart;
        System.out.println("Output sequence: " + result);
        System.out.println("Sum of odd digits: " + oddSum);

    }
}

// Enter any number: 368543
// Output sequence: 353684
// Sum of odd digits: 11
