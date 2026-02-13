public class Factorial {
    public static void main(String[] args) {
        System.out.println(trailingZeros(150000));
    }

    public static int trailingZeros(int n) {
        int count = 0;
        while (n > 0) {
            n /= 5;
            count += n;
        }
        return count;
    }

    public static long factorial(long n) {
        if (n == 1)
            return 1;
        return n * factorial(n - 1);
    }
}
