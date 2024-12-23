class Solution {
    public int reverse(int x) {
        long rev =0;
        int rem =0;
        int num=x;
        while(num !=0){
            rem = num % 10;
            rev = rev*10 + rem;
            num /=10;
        }
        if(rev <Integer.MIN_VALUE || rev >Integer.MAX_VALUE){
            return 0;
        }
        return (int)rev;
    }
}