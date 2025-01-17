class Solution {
    public boolean validPalindrome(String str) {
        int s=0;
        int e = str.length()-1;
        while(s<e){
            if(str.charAt(s) != str.charAt(e)){
                String skipL = str.substring(s+1, e+1);
                String skipR = str.substring(s, e);
                return (reverse(skipL) || reverse(skipR));
            }
            s++;
            e--;
        }
        return true;
    }
    public boolean reverse(String s){
        int start=0;
        int end = s.length()-1;
        while(start<end){
            if(s.charAt(start) != s.charAt(end)){
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
}