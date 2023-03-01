Question link - https://leetcode.com/problems/guess-number-higher-or-lower/description/

public class Solution extends GuessGame {
    public int guessNumber(int n) {
        int l = 1, h = n, m;
    
    while (l <= h) {
        m = l + (h - l) / 2;
        if (guess(m) == 0){
            return m;
        }  
        else if(guess(m) == 1){
            l = m + 1;
        } 
        else{
            h = m - 1;
        }
   }
    return - 1; 
    }
}
