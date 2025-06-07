class Solution {
    public int minOperations(int[] nums, int k) {
        int n=nums.length;
        Arrays.sort(nums);
        int low=0;
        int high=n-1;
        int ans=0;
        while(low<=high){
            int mid=(low+high)/2;
            if(nums[mid]>=k){
                ans=mid;
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return ans;
    }
}