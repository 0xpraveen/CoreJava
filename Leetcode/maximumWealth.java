class Solution {
    public int maximumWealth(int[][] accounts) {
        int sum=0, tsum=0;
        for (int row=0;row<accounts.length;row++){
            sum=0;
            for (int col=0;col<accounts[row].length;col++){
                sum=sum+accounts[row][col];
        }
            if(tsum<sum){
            tsum=sum;
                
            }
           
        
    }
        return tsum;
}
}
