public class Anagram {
    public static boolean anagram(String s, String s2) {
        s = s.replaceAll("\\s+", "").toLowerCase();
        s2 = s2.replaceAll("\\s+", "").toLowerCase();
        if(s.length()!=s2.length()) return false;
        int[] freq = new int[26];
        for(int i = 0; i < s.length(); i++) {
            freq[s.charAt(i)-'a']++;
            freq[s2.charAt(i)-'a']--;
        }
        for(int i : freq) {
            if(i!=0) return false;
        }
        return true;
    }
    public static void main(String[] args) {
        System.out.println(anagram("listen", "silent")); // true
        System.out.println(anagram("apple", "pale"));    // false
    }
}
