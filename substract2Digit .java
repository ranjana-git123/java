import java.util.Scanner;

public class Subtract2Digit {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter any number: ");
        String num = sc.next();  // Read as string

        // Repeat until result is 1 or 2 digits
        while(num.length() > 2){
            String sub = "";
            for(int i = 0; i < num.length() - 1; i++){
                int a = num.charAt(i) - '0'; // 0 = 48 (ASCII)
                int b = num.charAt(i+1) - '0';
                sub += Math.abs(a - b);
            }
            num = sub;  // Update num for next round
        }

        System.out.println("Output: " + num);
        sc.close();
    }
}

// Enter any number: 6928
// Output: 41

