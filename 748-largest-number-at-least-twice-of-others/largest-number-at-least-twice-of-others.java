class Solution {
    public int dominantIndex(int[] nums) {
        int index=-1;
        int max=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>max){
                max=nums[i];
                index=i;
            }
        }
        Arrays.sort(nums);
        int n=nums.length;
        int val=nums[n-2]*2;
        if(nums[n-1]>=val){
            return index;
        }
        return -1;
    }
}