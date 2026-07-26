class Solution {
    public boolean isStrictlyPalindromic(int n) {
        int end=n-2;
        for(int i=2;i<=end;i++){
            String str=Integer.toString(n,i);
            String rev=new StringBuilder(str).reverse().toString();
            if(!str.equals(rev)) return false;
        }
        return true;
    }
}
