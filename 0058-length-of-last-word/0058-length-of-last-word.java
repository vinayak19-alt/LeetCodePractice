class Solution {
    public int lengthOfLastWord(String s) {
        s = s.trim();
        int count=0;
        int last = s.length()-1;
        for(int i=last; i>=0; i--){
            if(s.charAt(i) != ' '){
                count++;
            }else{
                break;
            }
        }
        return count;
    }
}