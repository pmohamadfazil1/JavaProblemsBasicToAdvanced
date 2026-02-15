public class MostFrequenctChar {
    public static char mostFreq(String s) {
        int[] freq = new int[256];
        char c = ' ';
        for(int i = 0; i < s.length(); i++) {
            freq[s.charAt(i)]++;
        }
        int max = 0;
        for(int i = 0; i < s.length(); i++) {
            if(freq[s.charAt(i)]>max) {
                max = freq[s.charAt(i)];
                c = s.charAt(i);
            }
        }
        return c;
    }
    public static void main(String[] args) {
        System.out.println(mostFreq("swiss"));
    }
}
