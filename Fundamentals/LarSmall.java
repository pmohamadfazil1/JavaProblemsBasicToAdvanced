public class LarSmall {
    public static int Max(int a, int b, int c) {
        int max = a;
        if(b>max)max=b;
        if(c>max)max=c;
        return max;
    }
    public static int Min(int a, int b, int c) {
        int min = a;
        if(b<min)min=b;
        if(c<min)min=c;
        return min;
    }
    public static void main(String[] args) {
        System.out.println(Min(10,20, 100));
    }
    
}
