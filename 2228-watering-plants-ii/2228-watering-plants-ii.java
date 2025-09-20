class Solution {
    public int minimumRefill(int[] plants, int capacityA, int capacityB) {
        int i=0, j=plants.length-1;
        int count=0;
        int ca = capacityA;
        int cb = capacityB;
        while(i < j){
            if(ca >= plants[i]){
                ca -= plants[i];
            }else{
                count++;
                ca = capacityA - plants[i];
            }
            i++;
            if(cb >= plants[j]){
                cb -= plants[j];
            }else{
                count++;
                cb = capacityB - plants[j];
            }
            j--;
        }
        if(i == j){
            if(Math.max(ca, cb) < plants[i]){
                count++;
            }
        }
        return count;
    }
}