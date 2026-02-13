package Patterns;

public class ConcentricNumberPattern {
    public static void main(String[] args) {
        int n = 5;
        int size = 2 * n - 1;
        for(int i = 0; i < size; i++) {
            for(int j = 0; j < size; j++) {
                int top = i;
                int left = j;
                int right = size - 1 - j;
                int bottom = size - 1 - i;
                int val = n - Math.min(Math.min(top, bottom), Math.min(right, left));
                System.out.print(val + " ");
            }
            System.out.println();
        }
    }
    
}
