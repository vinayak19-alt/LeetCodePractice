class Solution {
    public int maxConsecutiveAnswers(String s, int k) {
        Map<Character, Integer> map = new HashMap<>();
        int i=0, j=0, maxLen=0, maxFreq = 0;;
        while(j < s.length()){
            map.put(s.charAt(j), map.getOrDefault(s.charAt(j), 0)+1);
            maxFreq = Math.max(maxFreq, map.get(s.charAt(j)));
            if(j-i+1 - maxFreq > k){
                map.put(s.charAt(i), map.get(s.charAt(i))-1);
                if(map.get(s.charAt(i)) == 0) map.remove(s.charAt(i));
                i++;
            }
            maxLen = Math.max(maxLen, j-i+1);
            j++;
        }
        return maxLen;
    }
}