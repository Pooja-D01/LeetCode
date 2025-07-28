class Solution {
    public void rotate(int[] nums, int k) {
        int arr[]=new int[nums.length];
        k = k % nums.length;
        int j=0;
        for(int i=nums.length-k;i<arr.length;i++){
            arr[j]=nums[i];
            j++;
        }
        for(int i=0;i<nums.length-k;i++){
            arr[j]=nums[i];
            j++;
        }
         for(int i=0;i<nums.length;i++){
            nums[i]=arr[i];
        }
    }
}