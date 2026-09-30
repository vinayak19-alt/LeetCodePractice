class Solution {
    public List<String> letterCombinations(String digits) {
        List<String> list = new ArrayList<>();
        if(digits.isEmpty()){
            return list;
        }
        helper("", digits, list, 0);
        return list;
    }

    private void helper(String p, String up, List<String> list, int index){
        if(index == up.length()){
            list.add(p);
            return;
        }
        int digit = up.charAt(index) - '0';
        int i = 3*(digit-2);
        if(digit > 7) i+=1;
        int len = i+3;
        if(digit == 7 || digit == 9) len+=1;

        for(; i<len; i++){
            char ch = (char)('a'+i);
            helper(p+ch, up, list, index+1);
        }
    }
}