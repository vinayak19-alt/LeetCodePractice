class Solution {
    public String reverseWords(String s) {
        s+=" ";
        char[] arr = s.toCharArray();
        int i=0;
        int j=i;
        for(; i<arr.length; i++){
            int k = i;
            if(arr[i] == ' '){
                --k;
                while(j < k){
                    char temp = arr[j];
                    arr[j] = arr[k];
                    arr[k] = temp;
                    j++;
                    k--;
                }
                if(i<arr.length-1){
                    j=i+1;
                }
            }
        }
        String str = new String(arr);
        return str.trim();
    }
}