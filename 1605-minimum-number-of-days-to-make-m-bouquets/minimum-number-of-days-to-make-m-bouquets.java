class Solution {
    public int minDays(int[] bloomDay, int m, int k) {
       
        int low=getMin(bloomDay);
        int high=getMax(bloomDay);
        int ans=-1;
        while(low<=high){
            int mid=(low+high)/2;
            if(is_possible(bloomDay,mid,m,k)==true){
                ans=mid;
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return ans;
    }
    boolean is_possible(int[] bloomDay,int mid,int m,int k){
        int count=0;
        int num_bouquets=0;
        for(int i=0;i<bloomDay.length;i++){
            if(bloomDay[i]<=mid){
                count++;
            }
            else{
                num_bouquets+=(count/k);
                count=0;
            }
        }
        num_bouquets+=count/k;
        if(num_bouquets>=m){
            return true;
        }
        return false;
    }
    int getMin(int[] bloomDay){
        int min=Integer.MAX_VALUE;
        for(int i=0;i<bloomDay.length;i++){
            if(bloomDay[i]<min){
                min=bloomDay[i];
            }
        }
        return min;
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

     
}