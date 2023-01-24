Question link - https://leetcode.com/problems/length-of-last-word/

class Solution {
    public int lengthOfLastWord(String s) {
        int i;
        s.trim();
        for(i=s.length()-1; i>0; i--){
            if(s.charAt(i) != ' '){
                break;
            }
        }
        int j=s.substring(0,i).lastIndexOf(' ');
        int l=i-j;
        return l;
    }
}
