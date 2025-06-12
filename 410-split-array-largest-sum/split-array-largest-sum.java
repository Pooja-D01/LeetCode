class Solution {
    public int splitArray(int[] nums, int k) {
        int low=getMax(nums);
        int high=getSum(nums);
        int ans=0;
        while(low<=high){
            int mid=(low+high)/2;
            int split=subArray(nums,mid);
            if(split<=k){
                ans=mid;
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return ans;
    }
    int subArray(int[] nums,int mid){
        int split=1;
        int sum=0;
        for(int i=0;i<nums.length;i++){
            if(sum+nums[i]<=mid){
                sum+=nums[i];
            }
            else{
                split++;
                sum=nums[i];
            }
        }
        return split;
    }
    int getMax(int[] nums){
        int max=Integer.MIN_VALUE;
        for(int val:nums){
            if(val>max){
                max=val;
            }
        }
        return max;
    }
    int getSum(int[] nums){
        int sum=0;
        for(int val:nums){
            sum+=val;
        }
        return sum;
    }
    
}