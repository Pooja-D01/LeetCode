class Solution {
    public String mergeAlternately(String word1, String word2) {
        char[] arr1=word1.toCharArray();
        char[] arr2=word2.toCharArray();
        int i=0;
        int j=0;
        String val="";
        while(i<arr1.length && j<arr2.length){
            val=val+arr1[i];
            val=val+arr2[j];
            i++;
            j++;
        }
        if(arr1.length>arr2.length){
            String sub = word1.substring(i,arr1.length); 
            val=val+sub;
        }
        
        if(arr1.length<arr2.length){
            String sub = word2.substring(j,arr2.length); 
            val=val+sub;
        }
        return val;
    }
}