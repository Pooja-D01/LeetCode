class Solution {
    public void rotate(int[] nums, int k) {
        int n=nums.length;
         if (n <= 1 || k % n == 0) 
         return;
         k = k % n;
        reverse(nums,0,nums.length-1);
        reverse(nums,0,k-1);
        reverse(nums,k,nums.length-1);
        
    }
    void reverse(int []nums,int start,int end){
        if(start<end){
            int temp=nums[start];
            nums[start]=nums[end];
            nums[end]=temp;
            reverse(nums,start+1,end-1);
        }
    }
}