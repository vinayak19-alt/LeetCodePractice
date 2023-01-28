Question link - https://leetcode.com/problems/valid-anagram/description/

class Solution {
    public boolean isAnagram(String s, String t) {
        char charArray1 [] = s.toCharArray();
        char charArray2 [] = t.toCharArray();
        Arrays.sort(charArray1);
        Arrays.sort(charArray2);
        boolean d = Arrays.equals(charArray1,charArray2);
        if(d == true){
            return true;
        }
        return false;
    }
}
