class Solution {
    public int minCost(String s, int[] neededTime) {
        int total =0;
        int prevMax = neededTime[0];
        for(int i=1; i<neededTime.length; i++){
            if(s.charAt(i) == s.charAt(i-1)){
                total += Math.min(prevMax, neededTime[i]);
                prevMax = Math.max(prevMax, neededTime[i]);
            }else{
                prevMax = neededTime[i];
            }
        }
        return total;
    }
}