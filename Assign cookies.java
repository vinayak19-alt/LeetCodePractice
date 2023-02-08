Question link - https://leetcode.com/problems/assign-cookies/description/

class Solution {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        int count=0;
        int i,j;
        for(i=g.length-1,j=s.length-1; i>=0 && j>=0; i--){
            if(s[j]>=g[i]){
                count++;
                j--;
            }
        }
        return count;
    }
}
