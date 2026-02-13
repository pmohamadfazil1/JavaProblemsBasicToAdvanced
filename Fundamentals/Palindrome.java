public class Palindrome {
    public static void main(String[] args) {
        System.out.println(pal(1215, 1215, 0));
    }
    public static boolean pal(int n, int temp, int rev) {
        if(n==0) {
            if(temp == rev) return true;
            else return false;
        }
        rev = rev * 10 + n% 10;
        return pal(n/10, temp, rev);
    }
}
