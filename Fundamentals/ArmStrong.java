public class ArmStrong {
    public static boolean isArmStrong(int n) {
        int len = (""+n).length();
        return n == Armstrong(n, len, 0);
    }
    public static int Armstrong(int n, int len, int sum) {
        if(n==0)return sum;
        sum+=Math.pow(n%10, len);
        return Armstrong(n/10, len, sum);
    }
    public static void main(String[] args) {
        System.out.println(isArmStrong(153));
    }
}
