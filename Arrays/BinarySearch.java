public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {2, 4, 6, 7, 10, 19, 51};
        System.out.println(binarySearch(arr,51));
    }
    public static int binarySearch(int[] arr, int key) {
        int left = 0;
        int right = arr.length-1;
        while(left<=right) {
            int mid = left + (right-left) / 2;
            if(key == arr[mid]) return mid;
            else if(key<arr[mid]) right = mid -1;
            else left = mid + 1;
        }
        return -1;
    }
}
