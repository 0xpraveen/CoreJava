//https://leetcode.com/problems/lucky-numbers-in-a-matrix/
class Solution {
    public List<Integer> luckyNumbers (int[][] matrix) {
        ArrayList<Integer> ans = new ArrayList<>();

        int rowmin=Integer.MAX_VALUE,minin=0;
        for(int i =0;i<matrix.length;i++){
            rowmin=Integer.MAX_VALUE;
            for(int j=0;j<matrix[i].length;j++){
                if(matrix[i][j]<rowmin){
                  rowmin=matrix[i][j];  
                    minin=j;
                }
                
                
            }
             
       int flag=0;
        for(int z=0 ; z<matrix.length; z++ ){
            if(matrix[z][minin]>matrix[i][minin]){
                flag=1;
                break;
            }}
            
            if(flag==0){
                ans.add(matrix[i][minin]);
            
        }
          
        }
       
    return ans;
    }
}
