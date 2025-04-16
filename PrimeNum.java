class PrimeNum {
    public static void main(String[] args) {
        int n=7;int count=0;
        for(int i=0;i<=n;i++)
        {
            if(i % n ==0)
            count++;
        }
        
        if(count==2){
            System.out.println("YES it is a prime ");
        }
        else{
            System.out.println("NO it is not a prime");
        }
    }
}
