public class Palindrome {
    public static boolean reverse(String s) {
        char[] ch = s.toCharArray();
        int left = 0;
        int right = ch.length - 1;
        while(left<right) {
            swap(ch, left, right);
            left++;
            right--;
        }
        String newS = new String(ch);
        return newS.equals(s);
    }
    public static void swap(char[] ch, int left, int right) {
        char c = ch[left];
        ch[left] = ch[right];
        ch[right] = c;
    }
    public static void main(String[] args) {
        String s = "aba";
        System.out.println(reverse(s));
    }
}
