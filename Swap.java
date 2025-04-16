import java.util.Scanner;
class Swap {
    public static void main(String[] args) {
        Scanner Sc=new Scanner(System.in);
        System.out.println("Enter a number 1: ");
        
        int num1 = Sc.nextInt();
        System.out.println("Enter a number 2: ");
        
        int num2 = Sc.nextInt();
        int temp=num1;
        num1=num2;
        num2=temp;
            
            System.out.println("After Swapping: ");
            System.out.println("num1 ="+ num1);
            System.out.println("num2 ="+ num2);
        }
    }
