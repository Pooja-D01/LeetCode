class Solution {
    public int search(int[] nums, int target) {
        // for(int i=0;i<nums.length;i++){
        //     if(nums[i]==target){
        //         return i;
        //     }
        // }
        // return -1;
        int low=0;
        int n=nums.length;
        int high=n-1;
        while(low<=high){
            int mid=(low+high)/2;
            if(target == nums[mid]){
                return mid;
            }
            else if(nums[mid]>target){
                high=mid-1;
            }
            else{
                low =mid+1;
            }
        }
        return -1;
    }
}