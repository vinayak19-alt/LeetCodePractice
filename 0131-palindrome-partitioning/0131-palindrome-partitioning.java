class Solution {
    public List<List<String>> partition(String s) {
        List<List<String>> result =new ArrayList<>();
        helper(result, new ArrayList<>(), s, 0);
        return result;
    }
    public void helper(List<List<String>> result, List<String> pal, String s, int index){
        if(index == s.length()){
            result.add(new ArrayList<>(pal));
            return;
        }
        for(int i=index; i<s.length(); i++){
            if(isPalindrome(s, index, i)){
                pal.add(s.substring(index, i+1));
                helper(result, pal, s, i+1);
                pal.remove(pal.size()-1);
            }
        }
    }
    public boolean isPalindrome(String s, int left, int right){
        while(left < right){
            if(s.charAt(left) != s.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}