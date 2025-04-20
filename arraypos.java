public class arraypos  {
    public static void main(String[] args) {
        int[] mark = {-3,10,14,-22,35};
        int i = 0;

        while (i < mark.length) {
            if (mark[i]<0){
            i++;
            continue;
            }
            System.out.println(mark[i]);
            i++;
        }
        
    }
}

// o/p
// 10
// 14
// 35
