class Solution {
    public String reverseVowels(String s) {
        int i=0, j=s.length()-1;
        StringBuilder sb = new StringBuilder(s);
        while(i < j){
            if(isVowel(sb.charAt(i)) && isVowel(sb.charAt(j))){
                swap(sb, i, j);
                i++;
                j--;
            }else if(!isVowel(sb.charAt(i)) && isVowel(sb.charAt(j))){
                i++;
            }else if(isVowel(sb.charAt(i)) && !isVowel(sb.charAt(j))){
                j--;
            }else{
                i++;
                j--;
            }
        }
        return sb.toString();
    }
    public boolean isVowel(char c){
        char ch = Character.toLowerCase(c);
        if(ch == 'a' || ch =='e' || ch == 'i' || ch == 'o' || ch == 'u'){
            return true;
        }
        return false;
    }
    public void swap(StringBuilder sb, int i, int j){
        char c = sb.charAt(i);
        sb.setCharAt(i, sb.charAt(j));
        sb.setCharAt(j, c);
    }
}