class Solution {
    public int maxArea(int[] height) {
        int i=0, j=height.length-1, max=0;
        while(i<j){
            int w = j-i;
            int h = Math.min(height[i], height[j]);
            int maxArea = w*h;
            max = Math.max(maxArea, max);
            if(height[i] < height[j]){
                i++;
            }else if(height[i] > height[j]){
                j--;
            }else{
                i++;
                j--;
            }
        }
        return max;
    }
}