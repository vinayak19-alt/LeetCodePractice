class Solution {
    public int maxArea(int[] height) {
        //for this we move the pointer that is pointing to the lesser number in the array
        //to maximise the area
        int i=0, j=height.length-1;
        int maxArea=0;
        while(i < j){
            int width =j-i;
            int area = Math.min(height[i], height[j]) * width;
            maxArea = Math.max(maxArea, area);
            if(height[i] > height[j]){
                j--;
            }else{
                i++;
            }
        }
        return maxArea;
    }
}