class Solution {
    public void moveZeroes(int[] nums) {
        int arr[]=new int[nums.length];
        int index=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=0){
                arr[index]=nums[i];
                index++;
            }
        }
        for(int j=0;j<nums.length;j++){
            nums[j]=arr[j];
        }

    }
}