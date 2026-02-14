public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = {2, 3, 1, 4, 2, 3,2,21};
        System.out.println(linearSearch(arr, 21));
    }
    public static int linearSearch(int[] arr, int key) {
        if(arr.length==0) return -1;
        for(int i = 0; i < arr.length; i++) {
            if(key==arr[i]) return i;
        }
        return -1;
    }
}
