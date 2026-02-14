import java.util.Arrays;

public class RemoveDup {
    public static void main(String[] args) {
        int[] arr = {2, 2,1, 1,2, 1,3, 2, 1};
        int size = remove(arr);
        for(int i = 0; i < size; i++) {
            System.out.println(arr[i]);
        }
    }
    public static int remove(int[] arr) {
        int k = 0;
        for(int i = 0; i< arr.length;i++) {
            boolean seen = false;
            for(int j = 0; j < k; j++) {
                if(arr[i]==arr[j]) {
                    seen = true;
                    break;
                }
            }
            if(!seen) {
                arr[k++] = arr[i];
            }
        }
        return k;
    }
}
