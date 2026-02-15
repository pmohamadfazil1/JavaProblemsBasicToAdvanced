public class LongestWord {
    public static String longest(String s) {
        String res = "";
        int max = 0;
        String[] words = s.trim().split("\\s+");
        for(int i = 0; i < words.length; i++) {
            if(words[i].length() > max) {
                max = words[i].length();
                res = words[i];
            }
        }
        return res;
    }
    public static void main(String[] args) {
        String s = "i am the dark knight rises";
        System.out.println(longest(s));
    }
}
