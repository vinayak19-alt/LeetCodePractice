class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> list = new ArrayList<>();
        helper(n, 0, 0, list, "");
        return list;
    }
    public void helper(int n, int left, int right, List<String> list, String s){
        if(s.length() == n*2){
            list.add(s);
            return;
        }
        if(left < n){
            helper(n, left+1, right, list, s+"(");
        }
        if(right < left){
            helper(n, left, right+1, list, s+")");
        }
    }
}