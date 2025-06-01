class Solution {
    public int countDigits(int num) {
        int temp=num;
        int count=0;
        while(num>0){
            int val=num%10;
            num=num/10;
            if(temp%val==0){
                count++;
            }
        }
        return count;        
    }
}