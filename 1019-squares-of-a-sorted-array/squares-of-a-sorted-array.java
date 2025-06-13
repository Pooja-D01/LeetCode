class Solution {
    public int[] sortedSquares(int[] nums) {
        for(int i=0;i<nums.length;i++){
            int sqrt=nums[i]*nums[i];
            nums[i]=sqrt;
        }
        Arrays.sort(nums);
        return nums;
    }
}