import java.util.Arrays;

public class MergeTwoSortedArray {
    public static void main(String[] args) {
        int[] n1 = {1,2,3,0,0,0};
        int[] n2 = {2, 5, 6};
        int m = 3;
        int n = 3;
        merge(n1, n2, m , n);
        System.out.println(Arrays.toString(n1));
    }
    public static void merge(int[] n1, int[] n2, int m, int n) {
        int i = m-1;
        int j = n-1;
        int k = n1.length-1;
        while(i>=0&&j>=0) {
            if(n2[j] > n1[i]) {
                n1[k--] = n2[j--];
            } else {
                n1[k--] = n1[i--];
            }
        }
        while(j>=0){
            n1[k--] = n2[j--];
        }
    }
}
