public class MajorityElement {
    public static void main(String[] args) {
        int[] arr = {1, 1,2,2,1,1,1,2,2};
        System.out.println(majorityElement(arr));
    }
    public static int majorityElement(int[] arr) {
        int cand = 0, count = 0;
        for(int i : arr) {
            if(count==0)cand = i;
            if(cand == i) count++;
            else count--;
        }
        count=0;
        for(int i : arr) {
            if(cand==i)count++;
        }
        return(count>arr.length/2) ? cand : -1;
    }
}
