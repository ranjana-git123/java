public class EvenSum {
    public static void main(String[] args) {
        int n=0;int  digit=0;
        while(n<10) {
            n++;
            if(n%2 !=0)
            continue;
            System.out.println(n);
            digit= digit+n;
            
        }
        System.out.println("sum :" +digit);
    }
}

// 2
// 4
// 6
// 8
// 10
// sum :30

