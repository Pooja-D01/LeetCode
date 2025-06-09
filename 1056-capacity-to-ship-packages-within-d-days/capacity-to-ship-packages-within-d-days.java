class Solution {
    public int shipWithinDays(int[] weights, int days) {
       int low=getMax(weights);
       int high=getSum(weights);
       int ans=0; 
       while(low<=high){
           int mid=(low+high)/2;
           if(is_possible(weights,mid,days)==true){
                ans=mid;
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return ans;
    }
    boolean is_possible(int[] weights,int mid,int days){
        int count=1;
        int val=0;
        int sum=0;
        for(int i=0;i<weights.length;i++){
            if(sum + weights[i]>mid){
                sum=0;
                count++;
            }
            sum+=weights[i];
        }
        if(count<=days){
            return true;
        }
        return false;
    }
    int getMax(int[] bloomDay){
        int max=Integer.MIN_VALUE;
        for(int i=0;i<bloomDay.length;i++){
            if(bloomDay[i]>max){
                max=bloomDay[i];
            }
        }
        return max;
    }

    int getSum(int[] bloomDay){
        int sum=0;
        for(int i=0;i<bloomDay.length;i++){
            sum+=bloomDay[i];
        }
        return sum;
    }
}