Question link - https://leetcode.com/problems/excel-sheet-column-title/

class Solution {
    public String convertToTitle(int n) {
        String c="";
        int r ;
        while(n>0){
            n--;
            r=n%26;
            c=(char) ('A'+r)+c;
            n=n/26;
        }
        return c;
    }
}
