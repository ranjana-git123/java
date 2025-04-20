public class EvenOddChec {
    public static void main(String[] args) {
        int n=0;
        while(n<10){
        n++; 
        

        if (n % 2 == 0) {
            System.out.println(n + " is Even.");
        } else {
            System.out.println(n + " is Odd.");
        }
        }
    }
}

//  o/p
//  1 is Odd.
//  2 is Even.
//  3 is Odd.
//  4 is Even.
//  5 is Odd.
//  6 is Even.
//  7 is Odd.
//  8 is Even.
//  9 is Odd.
//  10 is Even.
