public class FrequencyCount {
    public static void main(String[] args) {
        int[] arr = {2, 3, 5, 1, 4,3 ,1,2, 4,3, 2,2, 3,23, 4,34, 3,4, 3,23 ,2,323,2 ,3, 2,3, 24,232,2,323,24 ,3 ,2};
        int[] freq = new int[10000];
        for(int i : arr) {
            freq[i]++;
        }
        for(int i : arr) {
            if(freq[i] != -1) {
                System.out.println(i + " -> " + freq[i]);
                freq[i] = -1;
            }
        }
    }
}
