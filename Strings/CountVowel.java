import java.util.HashSet;

public class CountVowel {
    public static void main(String[] args) {
        
        String s = "i am the dark of the draker knight";
        int Vcount = 0;
        for(int i = 0; i < s.length(); i++) {
            char c = Character.toLowerCase(s.charAt(i));
            if("aeiou".indexOf(c) != -1) {
                Vcount++;
            }
        }
        System.out.println(Vcount);
    }
}
  