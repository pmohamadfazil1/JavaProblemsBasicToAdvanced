public class CountTrailingZeros {
    public static void main(String[] args) {
        System.out.println(countTrail(100, 0));
    }
    public static int countTrail(int n, int count) {
        if(n==0)return count;
        return countTrail(n/5, count+n/5);
    }
}
