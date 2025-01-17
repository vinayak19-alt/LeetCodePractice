class Solution {
    public String mergeAlternately(String word1, String word2) {
        StringBuilder sb = new StringBuilder();
        int n=0, m=0;
        while(n<word1.length() && m<word2.length()){
            sb.append(word1.charAt(n++)).append(word2.charAt(m++));
        }
        sb.append(word1.substring(m));
        sb.append(word2.substring(n));
        return sb.toString();
    }
}