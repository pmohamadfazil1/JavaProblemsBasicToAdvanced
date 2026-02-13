package Patterns;

public class Diamond {
    public static void main(String[] args) {
        int n = 5;
        int sp = n - 1;
        int st = 1;
        for(int i = 1; i < n*2; i++) {
            //space
            for(int j = 1; j <= sp; j++) System.out.print(" ");
            for(int j = 1; j <= st; j++) System.out.print("* ");
            if(i<n) {
                sp--;
                st++;
            }else{
                sp++;
                st--;
            }
            System.out.println();
        }
    }
    
}
