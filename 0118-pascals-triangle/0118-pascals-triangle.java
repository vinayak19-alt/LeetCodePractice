class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> list = new ArrayList<>();
        list.add(Arrays.asList(1));
        if(numRows > 1){
            list.add(Arrays.asList(1, 1));
        }
        for(int i=2; i<numRows; i++){
            List<Integer> dummy = list.get(list.size()-1);
            List<Integer> add = new ArrayList<>();
            add.add(dummy.get(0));
            for(int j=1; j<dummy.size(); j++){
                if(j != dummy.size()-1){
                    add.add(dummy.get(j-1) + dummy.get(j));
                } else {
                    add.add(dummy.get(j-1) + dummy.get(j));
                    add.add(dummy.get(j));
                }
            }
            list.add(new ArrayList<>(add));
        }
        return list;
    }
}