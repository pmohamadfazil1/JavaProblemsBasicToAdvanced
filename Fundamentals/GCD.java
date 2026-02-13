public class GCD {
    public static int gcdIterative(int a, int b) {
        while(b!=0) {
            int r = a % b;
            a = b;
            b = r;
        }
        return a;
    }
    public static int gcdRecursive(int a, int b) {
        if(b==0) return a;
        return gcdRecursive(b, a%10);
    }
    public static int LCM(int a, int b) {
        return (a/gcdRecursive(a, b)) * b;
    }
    
}
