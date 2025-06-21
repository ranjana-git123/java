public class magic{
    public static boolean isMagic(int num){
        while(num>9){
            int sum =0;
            while(num >0){
                int digit = num%10;
                sum = sum + digit;
                num= num/10;
              
            }
            num=sum;  
            
        }
        return num ==1;
    }
     public static void main(String[] args){
         int number = 1234;
       
     if(isMagic(number))
        System.out.println(number  + "  is a magic number");
     else
        System.out.println(number  + "  is not a magic number");
    
    }
}

// 1234 is a magic number
