import java.util.Arrays;
import java.util.HashSet;

public class UnionArray {
    public static int[] union(int[] a1, int[] a2) {
        HashSet<Integer> seen = new HashSet<>();
        for(int i : a1) {
            seen.add(i);
        }
        for(int i : a2) {
            seen.add(i);
        }
        int[] res = new int[seen.size()];
        int j = 0;
        for(int i : seen) {
            res[j++] = i;
        }
        return res;
    }
    public static void main(String[] args) {
        int[] a1 = {1, 2, 3};
        int[] a2 = {2, 3, 4};
        System.out.println(Arrays.toString(union(a1, a2)));
    }
}
