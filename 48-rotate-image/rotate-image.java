class Solution {
    public void rotate(int[][] matrix) {
        int n=matrix.length;
        int m=matrix[0].length;
        for(int i=0;i<=n-2;i++){
            for(int j=i+1;j<=n-1;j++){
                int temp=matrix[i][j];
                matrix[i][j]=matrix[j][i];
                matrix[j][i]=temp;
            }
        }
        for(int i=0;i<n;i++){
            int p1=0;
            int p2=n-1;
            while(p1<=p2){
                int temps=matrix[i][p1];
                matrix[i][p1]=matrix[i][p2];
                matrix[i][p2]=temps;
                p1++;
                p2--;
            }
        }
    }
}