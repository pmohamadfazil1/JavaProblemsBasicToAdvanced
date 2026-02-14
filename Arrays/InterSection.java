import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class InterSection {
    public static int[] InterSectionUnique(int[] a1, int[] a2) {
        ArrayList<Integer> list = new ArrayList<>();
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i : a1) {
            map.put(i, map.getOrDefault(i, 0) + 1);
        }
        for(int i : a2) {
            if(map.containsKey(i) && map.get(i)>0) {
                list.add(i);
                map.put(i, map.get(i)-1);
            }
        }
        int[] res = new int[list.size()];
        int j = 0;
        for(int i : list) {
            res[j++] = i;
        }
        return res;
    }
    public static void main(String[] args) {
        int[] a1 = {2, 2};
        int[] a2 = {2, 2, 2, 2, 2, 2};
        System.out.println(Arrays.toString(InterSectionUnique(a1, a2)));
    }
}
