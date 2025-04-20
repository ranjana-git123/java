public class FirstMultipleOf7 {
    public static void main(String[] args) {
        int[] mark = {3,10,14,22,35};
        int i = 0;

        while (i < mark.length) {
            if (mark[i] % 7 ==0){
            System.out.println(mark[i]);
            break;
            }
            i++;
        }
        
    }
}

//o/p
// 14
