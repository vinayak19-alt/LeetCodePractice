class Solution {
    public String reversePrefix(String word, char ch) {
        int index = word.indexOf(ch);
        int i=0;
        StringBuilder sb = new StringBuilder();
        int j = index;
        while(j >= 0){
            sb.append(word.charAt(j--));
        }
        sb.append(word.substring(index+1));
        return sb.toString();
    }
}