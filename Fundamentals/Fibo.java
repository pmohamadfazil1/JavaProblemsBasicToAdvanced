public class Fibo {
    public static void main(String[] args) {
        int n = 10;
        int[] arr = new int[n+1];
        fibo(n);
        // System.out.println(fibo(n));
    }
    // public static int fibo(int n, int[] arr) 
    // {
    //     // if(n<0) throw new IllegalArgumentException();
    //     if(n==0||n==1) return n;
    //     if(arr[n]!=0)return arr[n];
    //     return arr[n] = fibo(n-1, arr) + fibo(n-2, arr);
    // }
    // public static int fibo(int n){
    //     if(n==0||n==1)return 1;
    //     return fibo(n-1)+fibo(n-2);
    // }
    public static void fibo(int n) {
        System.out.print(0 + " " + 1);
        PrintFibo(0, 1, n);
    }
    public static void PrintFibo(int prev, int curr, int i) {
        if(i==1)return;
        int next = prev + curr;
        System.out.print(" " + next);
        PrintFibo(curr, next, i-1);
    }
}
