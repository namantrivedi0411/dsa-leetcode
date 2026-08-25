class Solution {
    public boolean stoneGame(int[] piles) {
        int even=0;int odd=0;
        for(int i=0;i<piles.length;i+=2){
            even+=piles[i];
            odd+=piles[i+1];
        }
        //alice always wins by taking all even idx or all odd idx
        return true;
    }
}
