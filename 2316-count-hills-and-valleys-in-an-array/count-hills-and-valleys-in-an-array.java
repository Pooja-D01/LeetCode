class Solution {
    public int countHillValley(int[] nums) {
        ArrayList<Integer> list=new ArrayList<>();
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]!=nums[i+1]){
                list.add(nums[i]);
            }
        }
        list.add(nums[nums.length-1]);

        int count=0;
        for(int i=1;i<list.size()-1;i++){
            if(list.get(i)>list.get(i+1)&& list.get(i)>list.get(i-1)){
                count++;
            }
            if( list.get(i)<list.get(i+1)&& list.get(i)<list.get(i-1)){
                count++;
            }
        }
        return count;
    }
}