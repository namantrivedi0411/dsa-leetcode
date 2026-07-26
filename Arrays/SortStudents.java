class Solution {
    public int[][] sortTheStudents(int[][] score, int k) {
        int order=0;
        for(int i=0;i<score.length;i++){
            int max=order;
            for(int j=max+1;j<score.length;j++){
                if(score[j][k]>score[max][k]){
                    max=j;
                }
            }
            int[] temp=score[order];
            score[order]=score[max];
            score[max]=temp;
            order++;
        }
        return score;
    }
}
