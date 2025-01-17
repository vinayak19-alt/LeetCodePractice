class Solution {
    public boolean isPalindrome(String s) {
        
        return helper(s.toLowerCase(), 0, s.length()-1);
    }
    public boolean helper(String str, int s, int e){
        if(s>e){
            return true;
        }
        if(!Character.isDigit(str.charAt(s)) && !Character.isLetter(str.charAt(s))){
            return helper(str, s+1, e);
        }
        if(!Character.isDigit(str.charAt(e)) && !Character.isLetter(str.charAt(e))){
            return helper(str, s, e-1);
        }
        if(str.charAt(s) != str.charAt(e)){
            return false;
        }
        return helper(str, s+1, e-1);
    }
}