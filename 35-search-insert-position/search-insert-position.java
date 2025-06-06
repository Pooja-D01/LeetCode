class Solution {
    public int searchInsert(int[] nums, int target) {
         int low=0;
        int n=nums.length;
        int high=n-1;
        int mid=0;
        int ans=n;
        while(low<=high){
            mid=(low+high)/2;
            if(nums[mid]>=target){
                ans=mid;
                high=mid-1;
            }
            else {
                low=mid+1;
            }
        }
        return ans;
    }
}