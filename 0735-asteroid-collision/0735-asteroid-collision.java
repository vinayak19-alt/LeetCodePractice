class Solution {
    public int[] asteroidCollision(int[] arr) {
        Stack<Integer> stack = new Stack<>();
        for(int i=0; i<arr.length; i++){
            if(arr[i] > 0){
                stack.push(arr[i]);
            }else{
                while(!stack.isEmpty() && stack.peek() > 0 && stack.peek() < Math.abs(arr[i])){
                    stack.pop();
                }
                if(stack.isEmpty() || stack.peek() < 0){
                    stack.push(arr[i]);
                }else if(stack.peek() + arr[i] == 0){
                    stack.pop();
                }
            }
        }
        int[] res = new int[stack.size()];
        int i = stack.size()-1;
        while(!stack.isEmpty()){
            res[i--] = stack.pop();
        }
        return res;
    }
}