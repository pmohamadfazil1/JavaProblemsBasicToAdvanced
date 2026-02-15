public class RotateByK {
    public static String rotateByK(String s, int k) {
        int n = s.length();
        if(n==0) return s;
        k = k% n;
        return s.substring(k) + s.substring(0, k);
    }
    public static void main(String[] args) {
        System.out.println(rotateByK("abcdef", 2));
    }
}
