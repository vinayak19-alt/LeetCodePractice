Question link - https://leetcode.com/problems/largest-perimeter-triangle/description/

class Solution {
    public int largestPerimeter(int[] nums) {
        Arrays.sort(nums);   
        int max=0;
        for(int i=0;i<=nums.length-3;i++){
            int a = nums[i];     
            int b = nums[i+1];
            int c = nums[i+2]; 
            if((a+b)>c){        
                if((a+c)>b){
                    if((b+c)>a){
                        int temp = a+b+c;
                        if(max<temp){
                            max = temp;      
                        }
                    }
                }
            }else{
             continue;   
            }
        }
        return max;
    }
}
