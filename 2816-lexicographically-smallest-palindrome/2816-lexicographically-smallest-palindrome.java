class Solution {
    public String makeSmallestPalindrome(String s) {
        char[] arr = s.toCharArray();
        int i=0, j=s.length()-1;
        while(i < j){
            if(arr[i] != arr[j]){
                if(arr[i] - '0' <= arr[j] - '0'){
                    arr[j] = arr[i];
                }else{
                    arr[i] = arr[j];
                }
            }
            i++;
            j--;
        }
        return new String(arr);
    }
}