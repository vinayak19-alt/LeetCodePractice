class Solution {
    public String removeStars(String s) {
        Stack<Character> stack = new Stack<>();
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i) != '*'){
                stack.push(s.charAt(i));
            }else{
                stack.pop();
                continue;
            }
        }
        for(char c : stack){
            sb.append(c);
        }
        return sb.toString();
    }
}