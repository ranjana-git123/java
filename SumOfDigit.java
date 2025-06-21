class SumOfDigit {
    public static void main(String[] args) {
        int num = 123;int sum =0;int digit= 0;
        while (num >0)
        {
        digit = num % 10;
        sum = sum + digit;
        num = num /10;
        }
        System.out.println("Sum of the digits are :"+ sum);
    }
}

// Sum of the digits are :6
