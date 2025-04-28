public class RemovDuplicatearr {
    public static void main(String[] args) {
        
        // Array given
        int arr[] = {4,2,4,5,2,3,1};
        int visited = 0;
        
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) { 
                for (int j = i + 1; j < arr.length; j++) {
                    if (arr[i] == arr[j]) {
                        arr[j] = visited;
                    }
                }
                System.out.println(arr[i]);
            }
        }

      // 4 
      // 2
      // 5
      // 3
      // 1
    }
}
