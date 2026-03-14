class Solution {
    public List<List<String>> partition(String s) {
        List<List<String>> result = new ArrayList<>();
        helper(result, new ArrayList<>(), s, 0);
        return result;
    }
    public void helper(List<List<String>> result, List<String> seq, String s, int index){
        if(index == s.length()){
            result.add(new ArrayList<>(seq));
            return;
        }
        for(int i=index; i<s.length(); i++){
            if(isPalindrome(s, index, i)){
                seq.add(s.substring(index, i+1));
                helper(result, seq, s, i+1);
                seq.remove(seq.size()-1);
            }
        }
    }
    public boolean isPalindrome(String s, int a, int b){
        while(a <= b){
            if(s.charAt(a) != s.charAt(b)){
                return false;
            }
            a++;
            b--;
        }
        return true;
    }
}