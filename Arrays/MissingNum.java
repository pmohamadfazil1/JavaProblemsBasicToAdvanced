public class MissingNum {
    
    public static void main(String[] args) {
        int[] arr = {3, 0 , 1};
        int sum = 0;
        int n = arr.length;
        int expected = (n*(n+1))/2;
        for(int i : arr) {
            sum+=i;
        }
        int res = expected-sum;
        System.out.println(res);
    }
}
