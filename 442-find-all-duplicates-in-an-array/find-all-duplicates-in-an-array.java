class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        HashMap<Integer,Integer> map=new HashMap<>();
        ArrayList<Integer> list=new ArrayList<>();
        for(int val:nums){
            if(map.containsKey(val)){
                map.put(val,map.get(val)+1);
            }
            else{
                map.put(val,1);
            }
        }
        for(Map.Entry<Integer,Integer> val:map.entrySet()){
            if(val.getValue()>=2){
                list.add(val.getKey());
            }
        }
        return list;
    }
}