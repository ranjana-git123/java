class Armstrong {
    public static void main(String[] args) {
        int n=153;int A=0; int B=0;int C=n;int D=0;
        while(n>0){
            A=n%10;
            B=A*A*A;
            D=D+B;
            n=n/10;
        }
        System.out.println(D);
        if(C==D){
            System.out.println("YES IT IS A ARMSTRONG NUMBER");
        }
        else{
            System.out.println("NO IT IS NOT A ARMSTRONG NUMBER");
        }
    }
}

//output
//153 
//YES IT IS A ARMSTRONG NUMBER
