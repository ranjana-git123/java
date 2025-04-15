class FindSmallNumber{
    public static void main(String[] args) {
        int num = 123;
        int small = 9; // Initialize with the maximum digit possible
        int digit;

        while (num > 0) {
            digit = num % 10; // Get the last digit
            if (digit < small) {
                small = digit; // Update smallest if current digit is smaller
            }
            num = num / 10; // Remove the last digit
        }

        System.out.println("Smallest digit: " + small);
    }
}
 
