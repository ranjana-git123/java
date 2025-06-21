import java.util.Scanner;
public class Ascending{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter any number:");
        int num = sc.nextInt();
        
        boolean isAscending =true;
        int prevdigit = num % 10;
        num = num / 10;
        
        while(num>0){
            int curdigit = num % 10;
            if(curdigit>prevdigit){
                isAscending = false;
            }
            prevdigit = curdigit;
            num =  num / 10;
        }
        
        if(isAscending){
           System.out.println("Yes it is in Ascending order"); 
        }
        else{
           System.out.println("No it is not in Ascending order");  
        }
        
    }
}

// Enter any number:2334
// Yes it is in Ascending order

// Enter any number:3214
// No it is not in Ascending order
