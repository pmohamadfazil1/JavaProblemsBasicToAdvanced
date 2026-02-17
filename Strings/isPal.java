
public class isPal {
    public static boolean isPalindrome(String s) {
        int l = 0, r = s.length() - 1;
        while(l<r) {
            if(s.charAt(l)!=s.charAt(r))return false;
            l++;
            r--;
        }
        return true;
    }
    public static String Check(String s) {
        StringBuilder sb = new StringBuilder();
        for(String str : s.split("\\s+")) {
            if(isPalindrome(str)) {
                sb.append(str).append(" ");
            }
        }
        return sb.toString().trim();
    }
    public static void main(String[] args) {
        String s = "eye level car boy";
        System.out.println(Check(s));
    }
}
