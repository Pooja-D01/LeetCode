class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        Arrays.sort(piles);
        int low=1;
        int n=piles.length;
        int high=piles[n-1];
        int ans=0;
        while(low<=high){
            int mid=(low+high)/2;
            int hrs=totalHours(piles,mid);
            if(hrs<=h){
                ans=mid;
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return ans;
    }
    int totalHours(int []piles,int hourly){
        int hours=0;
        for(int i=0;i<piles.length;i++){
            hours+=Math.ceil((double)piles[i]/hourly);
        }
        return hours;
    }
}