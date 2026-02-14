public class Equilibrium {
    public static int equil(int[] arr) {
        int j = arr.length-1;
        int lSum = 0, rSum = 0;
        for(int i = 0; i<arr.length;i++) {
            lSum += arr[i];
            rSum += arr[j];
            j--;
            if(lSum==rSum) return j;
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr = {1,3,5,2,2};
        System.out.println(equil(arr));
    }
}
