Question - BiWeekly contest(Q. 6359)

class Solution {
    public int minMaxDifference(int num) {
        int max=0;
        int temp=0;
        int min=Integer.MAX_VALUE;
        String t="";
        String s = String.valueOf(num);
       for(int i=0; i<s.length(); i++){
           t=s.replace(s.charAt(i), '0');
           temp=Integer.valueOf(t);
           if(temp<min){
               min=temp;
           }
           t=s.replace(s.charAt(i), '9');
           temp=Integer.valueOf(t);
           if(temp>max){
               max=temp;
           }
       }
        int m= max- min;
        return m;
    }
}
