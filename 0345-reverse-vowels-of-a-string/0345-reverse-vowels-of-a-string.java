class Solution {
    public String reverseVowels(String s) {
        char temp;
        char[] arr = s.toCharArray();
        int first =0;
        int last = arr.length-1;
        String vowels = "aeiouAEIOU";
        while(first<last){
            while(first < last && vowels.indexOf(arr[first]) == -1){
                first++;
            }
            while(first < last && vowels.indexOf(arr[last]) == -1){
                last--;
            }
            temp = arr[first];
            arr[first] = arr[last];
            arr[last]=temp;
            first++;
            last--;
        }
        String newStr = new String(arr);
        return newStr;
    }
}