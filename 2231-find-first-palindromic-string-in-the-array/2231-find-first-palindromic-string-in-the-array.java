class Solution {
    public String firstPalindrome(String[] words) {
        for(String word : words){
            if(reverse(word)){
                return word;
            }
        }
        return "";
    }
    public boolean reverse(String str){
        int s=0;
        int e = str.length()-1;
        while(s<e){
            if(str.charAt(s) != str.charAt(e)){
                return false;
            }
            s++;
            e--;
        }
        return true;
    }
}