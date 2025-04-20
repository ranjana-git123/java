public class EvenOddSum {
    public static void main(String[] args) {
        int n = 1;
        int evenSum = 0;
        int oddSum = 0;
        String oddNumbers = "";
        String evenNumbers = "";

        while (n <= 10) {
            if (n % 2 == 0) {
                evenSum += n;
                evenNumbers += n + "\n";
            } else {
                oddSum += n;
                oddNumbers += n + "\n";
            }
            n++;
        }

        // Print odd numbers vertically
        System.out.print(oddNumbers);
        System.out.println("Sum of Odd Numbers: " + oddSum);

        // Print even numbers vertically
        System.out.print(evenNumbers);
        System.out.println("Sum of Even Numbers: " + evenSum);
    }
}
