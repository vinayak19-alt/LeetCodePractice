class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> result = new ArrayList<>();
        helper(n, result, 0, 0, "");
        return result;
    }
    public void helper(int n, List<String> list, int open, int close, String seq){
        if(open == n && close == n){
            list.add(seq);
            return;
        }
        if(open < n){
            helper(n, list, open+1, close, seq+"(");
        }
        
        if(open > close){
            helper(n, list, open, close+1, seq+")");
        }
    }
}