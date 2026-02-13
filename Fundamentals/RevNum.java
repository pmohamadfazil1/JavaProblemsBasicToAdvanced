class RevNum {
    public static void main(String[] args) {
        System.out.println(rev(0, 2345));
    }
    public static int rev(int rev, int n){
        if(n==0)return rev;
        int temp = n%10;
        rev=rev*10+temp;
        return rev(rev,n/10);
    }
}