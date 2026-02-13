public class PerfectNum {
    public static void main(String[] args) {
        int n = 28;
        int sum = 0;
        for(int i = 1; i*i<=n; i++) {
            if(n%i==0) {
                sum += i;
                if(i!=n/i) {
                    sum+=n/i;
                }
            }
        }
        System.out.println(sum);
        sum-=n;
        System.out.println(sum==n);
    }
}
