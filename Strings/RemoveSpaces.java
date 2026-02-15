public class RemoveSpaces {
    public static void main(String[] args) {
        String s = "hello man";
        s = s.replaceAll("\\s+", "");
        System.out.println(s);
    }
}
