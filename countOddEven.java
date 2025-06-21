public class countOddEven{
    public static void main(String[] args){
        int num = 556822;
        int odd = 0;
        int even = 0;
        
        while(num>0){
            int digit = num%10;
            if (digit%2==0){
                even++;
            }
            else{
                odd++;
            }
            
            num=num/10;
        }
        System.out.println("ODD COUNT:" + odd );
        System.out.println("EVEN COUNT:" +even );
    }
}

// ODD COUNT:2
// EVEN COUNT:4
