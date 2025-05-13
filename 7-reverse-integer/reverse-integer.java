class Solution {
    public int reverse(int x) {
        int a=0;
        while(x!=0){
            int s=x%10;
            if(a>Integer.MAX_VALUE/10 || (a==Integer.MAX_VALUE/10 && s>7)){
                return 0;
            }
            if(a< Integer.MIN_VALUE/10 || (a==Integer.MIN_VALUE/10 && s<-8)){
                return 0;
            }

            a=a*10+s;
            x=x/10; 
        }
        return a;     
        
    }
}