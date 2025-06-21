class FindBigNumber {
    public static void main(String[] args) {
        int num = 123;int big=0;int a;
        while (num >0)
        {
        a = num %10;
        if (a > big)
        big = a;
        num =num/10;
        }
        System.out.println(big);
    }
}

// 3
