class Solution {
    public int reverse(int x) {
        long num=x;
        boolean isNeg=num<0;
        if(isNeg) num=-num;
        StringBuilder sb=new StringBuilder(Long.toString(num));
        sb.reverse();
        long rev=Long.parseLong(sb.toString());
        if(isNeg) rev=-rev;
        if(rev<Integer.MIN_VALUE || rev>Integer.MAX_VALUE) return 0;
        return (int)rev;
    }
}
