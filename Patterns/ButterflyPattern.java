package Patterns;

public class ButterflyPattern {
    public static void main(String[] args) {
        int n = 5;

        for (int i = 1; i <= 2*n; i++) {
            int stars = i <= n ? i : 2*n - i;      // number of stars
            int spaces = i <= n ? 2*(n - i) : 2*(i - n); // middle spaces

            // left stars
            for (int j = 1; j <= stars; j++) System.out.print("*");
            // middle spaces
            for (int j = 1; j <= spaces; j++) System.out.print(" ");
            // right stars
            for (int j = 1; j <= stars; j++) System.out.print("*");

            System.out.println();
        }
    }
}
