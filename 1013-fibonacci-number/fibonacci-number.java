class Solution {
      List<Integer> num=new ArrayList<>();
    public int fib(int n) {
       
        int a=0;
        int b=1;
        num.add(a);
        num.add(b);
        if(n<2){
            return num.get(n);
        }
        return check(0,1,n);
    }
        int check(int a,int b,int n){
            int next=a+b;
            
            num.add(next);
            if(num.size()>n){
                return num.get(n);
            }
            return check(b,next,n);
        }
       
        
    }