Question link - https://leetcode.com/problems/find-the-difference/description/

class Solution {
    public char findTheDifference(String s, String t) {
        char ch=' ';
        char[] sChar = s.toCharArray();
        char[] tChar = t.toCharArray();
        Arrays.sort(sChar);
        Arrays.sort(tChar);int i=0;
        for(i=0; i<tChar.length-1; i++){
            if(sChar[i]!=tChar[i]){
                ch=tChar[i];
                break;
            }

                    }
                    if(i==sChar.length)
                    {
                        ch=tChar[i];
                    }
        return ch;
    }
}
