Question link - https://leetcode.com/problems/fair-candy-swap/description/

class Solution {
    public int[] fairCandySwap(int[] A, int[] B) {
        int sumA=0;
        int sumB=0;
        Set<Integer>setA = new HashSet<>();
        for(int i=0; i<A.length; i++){
            sumA+=A[i];
            setA.add(A[i]);
        }
        for(int j=0; j<B.length; j++){
            sumB+=B[j];
            
        }
        int dif = (sumA-sumB)/2;
        for(int i=0; i<B.length; i++){
            int target= B[i]+dif;
            if(setA.contains(target)){
                return new int[]{target, B[i]};
            }
        }
        return null;
    }
}
