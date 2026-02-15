public class ToggleCase {
    public static String toggle(String s) {
        char[] ch = s.toCharArray();
        for(int i = 0; i < ch.length; i++) {
            if(ch[i] == ' ') continue;
            if(Character.isUpperCase(ch[i])) {
                ch[i] = Character.toLowerCase(ch[i]);
            } else {
                ch[i] = Character.toUpperCase(ch[i]);
            }
        }
        return new String(ch);
    }
    public static void main(String[] args) {
        String s = "i Am HeLLo";
        System.out.println(toggle(s));
    }
}
