public class CountWords {
    public static int countWord(String s) {
        // int count = 0;
        // // for(int i = 0; i < s.length(); i++) {
        // //     if(s.charAt(i) == ' ' || i==s.length()-1) {
        // //         count++;
        // //     }
        // // }
        // // return count;
        String[] words = s.trim().split("\\s+");
       return words.length;
    }
    public static void main(String[] args) {
        String s = "i Am HeLLo world";
        System.out.println(countWord(s));
    }
}
