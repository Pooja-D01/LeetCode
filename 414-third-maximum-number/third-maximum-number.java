class Solution {
    public int thirdMax(int[] nums) {
        ArrayList<Integer> list=new ArrayList<>();
        Arrays.sort(nums);
        for(int i=nums.length-1;i>=0;i--){
            if(!list.contains(nums[i])){
                list.add(nums[i]);
            }
        }
        if(list.size()<3){
            return list.get(0);
        }
        return list.get(2);
    }
}