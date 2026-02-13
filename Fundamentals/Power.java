public class Power {
    public static void main(String[] args) {
        System.out.println(pow(4, 2));
    }
    public static int pow(int base, int exponent) {
        if(exponent == 0) return 1;
        return base * pow(base, exponent-1);
    }
    
}
