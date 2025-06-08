class Solution {
    public int smallestDivisor(int[] nums, int threshold) {
        Arrays.sort(nums);
        int low=1;
        int high=nums[nums.length-1];
        int val=0;
        while(low<=high){
            int mid=(low+high)/2;
            int ans=divisor(nums,mid);
            if(ans<=threshold){
                val=mid;
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return val;
    }
    int divisor(int[] nums,int mid){
        int sum=0;
        for(int a:nums){
            sum+=Math.ceil((double)a/mid);
        }
        return sum;
    }
}