class Solution {
    public String largestMerge(String word1, String word2) {
        StringBuilder merge = new StringBuilder();
        int i=0, j=0;
        while(i < word1.length() && j < word2.length()){
            if(ascii(word1.charAt(i)) == ascii(word2.charAt(j))){
                if(check(word1, i, word2, j)){
                    merge.append(word1.charAt(i));
                    i++;
                }else{
                    merge.append(word2.charAt(j));
                    j++;
                }
            }
            else if(ascii(word1.charAt(i)) > ascii(word2.charAt(j))){
                merge.append(word1.charAt(i));
                i++;
            }else{
                merge.append(word2.charAt(j));
                j++;
            }
        }
        while(i < word1.length()){
            merge.append(word1.charAt(i));
            i++;
        }
        while(j < word2.length()){
            merge.append(word2.charAt(j));
            j++;
        }
        return merge.toString();
    }
    public int ascii(char ch){
        return ch - '0';
    }
    public boolean check(String s1, int i, String s2, int j){
        while(i<s1.length() && j < s2.length()){
            if(s1.charAt(i) == s2.charAt(j)){
                i++;
                j++;
            }else if(s1.charAt(i) > s2.charAt(j)){
                return true;
            }else{
                return false;
            }
        }
        if(i < s1.length()){
            return true;
        }
        return false;
    }
}