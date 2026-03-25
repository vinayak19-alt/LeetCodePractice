class Solution {
    public List<String> letterCombinations(String digits) {
        if(digits.isEmpty()){
            List<String> list = new ArrayList<>();
            return list;
        }
        List<String> result = new ArrayList<>();
        helper(digits, result, "");
        return result;
    }
    public void helper(String digits, List<String> result, String str){
        if(digits.isEmpty()){
            result.add(str);
            return;
        }
        int digit = digits.charAt(0) - '0';
        int i = (digit-2)*3;
        if(digit > 7){
            i+=1;
        }
        int len = i+3;
        if(digit == 7 || digit == 9){
            len+=1;
        }
        for(; i<len; i++){
            char ch = (char)('a' + i);
            helper(digits.substring(1), result, str+ch);
        }
    }
}