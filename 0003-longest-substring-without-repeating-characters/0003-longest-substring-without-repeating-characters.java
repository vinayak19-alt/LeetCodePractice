class Solution {
    public int lengthOfLongestSubstring(String s) {
        int i=0, j=0, maxLen=0;
        int[] hash = new int[256];
        Arrays.fill(hash, -1);
        while(j < s.length()){
            if(hash[s.charAt(j)] != -1){
                if(hash[s.charAt(j)] >= i){
                    i = hash[s.charAt(j)] + 1;
                }
            }
            int len = j - i + 1;
            maxLen = Math.max(len, maxLen);
            hash[s.charAt(j)] = j;
            j++;
        }
        return maxLen;
    }
}