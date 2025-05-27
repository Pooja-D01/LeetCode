class Solution {
    public int subarraySum(int[] nums, int k) {
        int count=0;
        int sum=0;
        int rem=0;
        HashMap <Integer,Integer> map=new HashMap<>();
        map.put(0,1);
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
            rem=sum-k;
            if(map.containsKey(rem)){
                count=count+map.get(rem);
            }
            if(!map.containsKey(sum)){
                map.put(sum,1);
            }
            else{
                map.put(sum,map.get(sum)+1);
            }
        }
        return count;
    }
}