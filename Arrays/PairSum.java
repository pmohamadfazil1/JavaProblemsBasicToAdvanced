import java.util.Arrays;

public class PairSum {
    public static void main(String[] args) {
        int[] arr = {2, 7, 1, 10, 6};
        int[] res = pairSum(arr, 13);
        System.out.println(Arrays.toString(res));
    }
    public static int[] pairSum(int[] arr, int sum) {
        for(int i = 0; i < arr.length; i++) {
            for(int j = i+1; j < arr.length; j++) {
                if(sum == arr[i]+arr[j]) {
                    return new int[]{i, j};
                }
            }
        }
        return new int[]{-1, -1};
    }
}
