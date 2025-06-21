import java.util.Scanner;
class PosNegO {
    public static void main(String[] args) {
        Scanner Sc=new Scanner(System.in);
        System.out.println("Enter a number: ");
        
        int num = Sc.nextInt();
        
        if(num>0){
            System.out.println("It is a positive number ");
        }
        else if(num<0){
            System.out.println("It is a negative number");
        }
        else{
            System.out.println("It is a Zero");
        }
    }
}
// Enter a number: -2
// It is a negative number
// Enter a number: 28
// It is a positive number 
