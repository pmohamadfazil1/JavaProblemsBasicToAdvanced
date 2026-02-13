public class SumOfDigit {
    public static void main(String[] args) {
        System.out.println(sum(0,278910));
    }
    public static int sum(int n) {
        if(n<9) return n;
        while(true) {
            int sum = 0;
            while(n!=0) {
                sum+=n%10;
                n/=10;
            }
            if(sum<10) return sum;
            n = sum;
        }
    }
    public static int sum(int sum, int n) {
        if(n==0) {
            if(sum>10) {
                n=sum;
                return sum(0, n);
            } else {
                return sum;
            }
        }
        sum += n%10;
        return sum(sum ,n/10);
    }
}
