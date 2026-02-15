public class RevString {
    public static String reverse(String s) {
        char[] ch = s.toCharArray();
        int left = 0;
        int right = ch.length - 1;
        while(left<right) {
            swap(ch, left, right);
            left++;
            right--;
        }
        String newS = new String(ch);
        return newS;
    }
    public static void swap(char[] ch, int left, int right) {
        char c = ch[left];
        ch[left] = ch[right];
        ch[right] = c;
    }
    public static void main(String[] args) {
        String s = "fazil";
        System.out.println(reverse(s));
    }
}
