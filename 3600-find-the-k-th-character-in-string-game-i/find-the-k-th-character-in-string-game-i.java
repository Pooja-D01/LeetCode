class Solution {
    public char kthCharacter(int k) {
        
        String s="a";
        return check(s,k);
    }
    public char check(String val,int k){
        if(val.length()>=k){
            return val.charAt(k-1);
        }
        int length=val.length();
        for(int i=0;i<length;i++){
            char ch=val.charAt(i);
            ++ch;
            val+=ch;
        }
        return check(val,k);
    }
}            