class Solution {
    public List<String> letterCombinations(String digits) {
        if(digits.length()==0){
            List<String> list = new ArrayList<>();
            return list;
        }
        List<String> ans = new ArrayList<>();
        ans.addAll(helper("",digits));
        return ans;
    }
    public List<String> helper(String p, String up){
        if(up.isEmpty()){
            List<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        int digit = up.charAt(0)-'0';
        int i = (digit-2)*3;
        if(digit>7){
            i+=1;
        }
        int len = i+3;
        if(digit==7 || digit==9){
            len+=1;
        }
        List<String> ans = new ArrayList<>();
        for(;i<len;i++){
            char ch = (char)('a'+i);
            ans.addAll(helper(p+ch, up.substring(1)));
        }
        return ans;
    }
}