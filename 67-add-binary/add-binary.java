 import java.math.BigInteger;
 class Solution {
    public String addBinary(String a, String b) {
        BigInteger num1=new BigInteger(a,2);
        BigInteger num2=new BigInteger(b,2);
        BigInteger val=num1.add(num2);
         String result = val.toString(2);
        return result;
    }
}