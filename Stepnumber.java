import java.util.Scanner;
public class steppingNumber{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter any number:");
        int num = sc.nextInt();
        
        boolean isStepping =true;
        int prevdigit = num % 10;
        num = num / 10;
        
        while(num>0){
            int curdigit = num % 10;
            if(Math.abs(curdigit-prevdigit)!=1){
                isStepping = false;
            }
            prevdigit = curdigit;
            num =  num / 10;
        }
        
        if(isStepping){
           System.out.println("Yes These are Stepping numbers"); 
        }
        else{
           System.out.println("No These are not stepping numbers");  
        }
        
    }
}

// Enter any number:1234
// Yes These are Stepping numbers

// Enter any number:1256
// No These are not stepping numbers
