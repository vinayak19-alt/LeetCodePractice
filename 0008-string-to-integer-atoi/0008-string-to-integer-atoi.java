class Solution {
    public int myAtoi(String s) {
        s=s.trim();
        if(s.length() == 0) return 0;
        int sign = 1;
        int index=0;
        if(s.charAt(0) == '-' || s.charAt(0) == '+'){
            sign = (s.charAt(0) == '-') ? -1 : 1;
            index++;
        }
        long result = helper(s, 0, index);
        result *= sign;
        if(result > Integer.MAX_VALUE) return Integer.MAX_VALUE;
        if(result < Integer.MIN_VALUE) return Integer.MIN_VALUE;

        return (int) result;
    }
    public long helper(String s, long num, int index){
        if(index >= s.length() || !Character.isDigit(s.charAt(index))){
            return num;
        }
        if (num > (long)Integer.MAX_VALUE + 1) {
            return num;
        }
        num = num * 10 + (s.charAt(index) - '0');
        return helper(s, num, index+1);
    }
}