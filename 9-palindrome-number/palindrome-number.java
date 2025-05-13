class Solution {
    public boolean isPalindrome(int x) {
        int a=0;
        int temp=x;
        if(x<0){
            return false;
        }
        while(x!=0){
            int s=x%10;
            a=a*10+s;
            x=x/10;
        } 
       
       return a==temp;
    }
}