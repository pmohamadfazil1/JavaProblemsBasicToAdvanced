public class Prime {
    public static void main(String[] args) {
        // System.out.println(isPrime(15, 1));
        PrintPrime(20, 2);
    }
    public static boolean isPrime(int n) {
        if(n<=1)return false;
        return prime(2, n);
    }
    public static void PrintPrime(int n, int i) {
        if(i>n)return;
        if(isPrime(i)) System.out.println(i);
        PrintPrime(n, i+1);
    }
    public static boolean prime(int i, int n) {
        if(i*i>n)return true;
        if(n%i==0)return false;
        return prime(i+1, n);
    }
}