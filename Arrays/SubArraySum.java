import java.util.ArrayList;
import java.util.Arrays;

public class SubArraySum {
    public static int[] sumSub(int[] arr, int tot) {
        for(int i = 0; i < arr.length; i++) {
            int j = i;
            int sum = 0;
            ArrayList<Integer> list = new ArrayList<>();
            while(j<arr.length){
                sum += arr[j];
                list.add(arr[j]);
                if(sum==tot){
                int[] res = new int[list.size()];
                int k = 0;
                for(int n : list) {
                    res[k++] = n;
                }
                return res;
            }
                if(sum>tot){
                    break;
                }
                j++;
            }
            
        }
        return new int[]{-1, -1};
        
    }
    public static void main(String[] args) {
        int[] arr = {1,4,20,3,10,5};
        System.out.println(Arrays.toString(sumSub(arr, 33)));
    }
}
