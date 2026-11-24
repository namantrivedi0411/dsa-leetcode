class Solution {
    public int minimumArea(int[][] grid) {
        int xStart=Integer.MAX_VALUE;int xEnd=Integer.MIN_VALUE;
        int yStart=Integer.MAX_VALUE;int yEnd=Integer.MIN_VALUE;
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[i].length;j++){
                if(grid[i][j]==1){
                    xStart=Math.min(xStart,j);
                    xEnd=Math.max(xEnd,j);
                    yStart=Math.min(yStart,i);
                    yEnd=Math.max(yEnd,i);
                }
            }
        }
        return (xEnd-xStart+1)*(yEnd-yStart+1);
    }
}
