import java.util.Arrays;

public class MoveZeros {
    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public static void main(String[] args) {
        int[] arr = {2, 0, 1, 0, 0, 3, 5, 4};
        int j = 0;
        for(int i = 0; i < arr.length; i++) {
            if(arr[i]!=0){
                swap(arr, i, j);
                j++;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
