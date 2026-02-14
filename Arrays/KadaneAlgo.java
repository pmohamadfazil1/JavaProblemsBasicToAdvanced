public class KadaneAlgo {
    public static void main(String[] args) {
        int[] arr = {-4, -2, -7, -1};
        System.out.println(kadane(arr));
    }
    public static int kadane(int[] arr) {
        int sum = 0;
        int max = Integer.MIN_VALUE;
        for(int i : arr) {
            sum += i;
            max = Math.max(sum, max);
            if(sum<0)sum = 0;
        }
        return max;
    }
}
