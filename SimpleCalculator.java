public class SimpleCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a num1: ");
        double num1 = input.nextDouble();
        System.out.print("Enter a num2: ");
        double num2= input.nextDouble();
        System.out.println("Enter any operation + - * /: ");
        char operator = input.next().charAt(0);
        
        double result;
        
        switch(operator){
         case '+':
                result = num1 + num2;
                System.out.println("Result = " + result);
                break;
            case '-':
                result = num1 - num2;
                System.out.println("Result = " + result);
                break;
            case '*':
                result = num1 * num2;
                System.out.println("Result = " + result);
                break;
            case '/':
                if (num2 != 0) {
                    result = num1 / num2;
                    System.out.println("Result = " + result);
                } else {
                    System.out.println("Cannot divide by zero!");
                }
                break;
            default:
                System.out.println("Invalid operator!");
        }
        
    }
}
