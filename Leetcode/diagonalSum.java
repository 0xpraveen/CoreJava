//https://leetcode.com/problems/matrix-diagonal-sum/
class Solution {
    public int diagonalSum(int[][] mat) {
        int sum=0,tsum=0;
        if(mat.length==1)
            
            return mat[0][0];
        
        for(int row=0;row<mat.length;row++){
          
            sum=sum+mat[row][row]+mat[row][(mat.length-1)-row];
        }
                 
    if(mat.length%2==0)
    {
        tsum= sum;
    }   
        else{
              tsum= sum-mat[mat.length/2][mat.length/2];
        }
        return tsum;
    
    }
    
}
