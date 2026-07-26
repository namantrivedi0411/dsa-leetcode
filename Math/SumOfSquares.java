class Solution {
    public boolean judgeSquareSum(int c) {
        for(long a=0;a*a<=c;a++){
            long b=c-(a*a);
            long sqrtB=(long)Math.sqrt(b);
            if(sqrtB*sqrtB==b) return true;
        }
        return false;
    }
}
