class Solution {
    public List<String> letterCombinations(String digits) {
        List<String> list = new ArrayList<>();
        if(digits.isEmpty()){
            return list;
        }
        helper("", digits, list);
        return list;
    }

    private void helper(String p, String up, List<String> list){
        if(up.isEmpty()){
            list.add(p);
            return;
        }
        int digit = up.charAt(0) - '0';
        int i = 3*(digit-2);
        if(digit > 7) i+=1;
        int len = i+3;
        if(digit == 7 || digit == 9) len+=1;

        for(; i<len; i++){
            char ch = (char)('a'+i);
            helper(p+ch, up.substring(1), list);
        }
    }
}