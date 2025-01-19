class Solution {
    public String reverseWords(String s) {
        String str = s.trim();
        String[] arr = str.split("\\s+");
        int start = 0;
        int last = arr.length-1;
        while(start<last){
            String temp = arr[start];
            arr[start]=arr[last];
            arr[last]=temp;
            start++;
            last--;
        }
        String newStr = String.join(" ", arr);
        return newStr;
    }
}