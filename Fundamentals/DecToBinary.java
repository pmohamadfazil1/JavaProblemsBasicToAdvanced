public class DecToBinary {
    public static void main(String[] args) {
        int dec = 45;
        String bin = "";
        while(dec>0) {
            bin = (dec%2) + bin;
            dec/=2;
        }
        System.out.println(bin);
        System.out.println(BinToDec(Integer.parseInt(bin)));
    }
    public static int BinToDec(int n) {
        int dec = 0, pow = 1;
        while(n>0) {
            dec += (n%10) * pow;
            pow*=2;
            n/=10;
        }
        return dec;
    }
}
