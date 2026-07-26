class Solution {
    public String removeOccurrences(String s, String part) {
        int k=part.length();
        StringBuilder sb=new StringBuilder(s);
        int n=sb.length();
        for(int i=0;i<=n-k;i++){
            if(sb.toString().substring(i,i+k).equals(part)){
                sb.delete(i,i+k);
                i=-1;
                n=sb.length();
            }
        }
        return sb.toString();
    }
}
