class PrimeNum {
    public static void main(String[] args) {
        int n = 9;
        int count = 0;

        for (int i = 1; i <= n; i++) {
            if (n % i == 0)
                count++;
        }

        if (count == 2) {
            System.out.println("YES, it is a prime");
        } else {
            System.out.println("NO, it is not a prime");
        }
    }
}

// NO, it is not a prime
