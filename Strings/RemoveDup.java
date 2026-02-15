public class RemoveDup {
    public static String removeDuplicates(String s) {
        char[] ch = s.toCharArray();
        boolean[] seen = new boolean[256];
        StringBuilder sb = new StringBuilder();
        for(char c : ch) {
            if(!seen[c])  {
                seen[c]=true;
                sb.append(c);
            }
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        System.out.println(removeDuplicates("programming"));
    }
}
