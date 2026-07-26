class Solution {
    public void rotate(int[][] matrix) {
        int n=matrix.length;
        Stack<Integer> s=new Stack<>();
        for(int i=n-1;i>=0;i--){
            for(int j=0;j<n;j++){
                s.push(matrix[j][i]);
            }
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                matrix[i][j]=s.pop();
            }
        }
    }
}
