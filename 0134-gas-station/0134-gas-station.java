class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int sumGas=0, sumCost=0;
        for(int i=0; i<gas.length; i++){
            sumGas += gas[i];
        }
        for(int i=0; i<cost.length; i++){
            sumCost += cost[i];
        }
        if(sumGas < sumCost){
            return -1;
        }
        int total=0, start=0;
        for(int i=0; i<gas.length;i++){
            total += gas[i]-cost[i];
            if(total < 0){
                total=0;
                start = i+1;
            }
        }
        return start;
    }
}