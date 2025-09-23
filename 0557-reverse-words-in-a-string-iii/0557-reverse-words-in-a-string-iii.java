class Solution {
    public String reverseWords(String s) {
        //we can do this question by adding a space after s and keep the code same and
        //just return trim of the string to get rid of the last space you added
        //but in java Strings are immutable so if you add anything to a string it will
        //create a new memory address, if we want to avoid that we need to use line 25-33
        //to just check if i is at lat of array the reverse the string
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
            if(i == arr.length-1){
                while(j < k){
                    char temp = arr[j];
                    arr[j] = arr[k];
                    arr[k] = temp;
                    j++;
                    k--;
                }
            }
        }
        return new String(arr);
    }
}