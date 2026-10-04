class Solution {
    public int maxIncreaseKeepingSkyline(int[][] grid) {
        int n=grid.length;
        int[] rowMax=new int[n];
        int[] colMax=new int[n];
        for(int i=0;i<n;i++){
            int rMax=0;int cMax=0;
            for(int j=0;j<n;j++){
                rMax=Math.max(rMax,grid[i][j]);
                cMax=Math.max(cMax,grid[j][i]);
            }
            rowMax[i]=rMax;
            colMax[i]=cMax;
        }
        int sum=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(grid[i][j]<rowMax[i] && grid[i][j]<colMax[j]){
                    sum+=Math.min(rowMax[i],colMax[j])-grid[i][j];
                }
            }
        }
        return sum;
    }
}
