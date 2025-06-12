class Solution {
    public int sumOfUnique(int[] nums) {
        HashMap <Integer,Integer> map=new HashMap<>();
        int sum=0;
        for(int val:nums){
            if(map.containsKey(val)){
                map.put(val,map.get(val)+1);
            }
            else{
                map.put(val,1);
            }
        }
        for(Map.Entry<Integer,Integer> val:map.entrySet()){
            if(val.getValue()==1){
                sum+=val.getKey();
            }
        }
        return sum;

    }
}