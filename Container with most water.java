Question link - https://leetcode.com/problems/container-with-most-water/submissions/881372338/

class Solution {
    public int maxArea(int[] height) {
        int i=0, large=0;
        int j= height.length-1;
        while(i<j){
            int w= j-i;
            int h= Math.min(height[i], height[j]);
            int area = h*w;
            large = Math.max(area, large);
            if(height[i]< height[j]) i++;
            else if(height[i]>height[j]) j--;
            else{
                i++;
                j--;
            }
        }
        return large;
    }
}
