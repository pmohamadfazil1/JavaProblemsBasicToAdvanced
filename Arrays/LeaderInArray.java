import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class LeaderInArray {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        int[] arr = {16,17,4,3,5,2};
        int max = Integer.MIN_VALUE;
        for(int i = arr.length-1; i>=0;i--) {
            if(arr[i]>max) {
                list.add(arr[i]);
                max=arr[i];
            }
        }
       for(int i:list) {
        System.out.print(i +" ");
       }
    }
}
