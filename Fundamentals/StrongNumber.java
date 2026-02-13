public class StrongNumber {
    public static boolean isStrong(int n) {
        int sum = Strong(n, 0);
        return n == sum;
    }
    public static int Strong(int temp, int sum) {
        if(temp==0) return sum;
        sum += fact(temp%10);
        return Strong(temp/10, sum);
    }
    public static int fact(int n) {
        if(n==0||n==1)return 1;
        return n * fact(n-1);
    }
    public static void main(String[] args) {
        System.out.println(isStrong(155));
    }
}
