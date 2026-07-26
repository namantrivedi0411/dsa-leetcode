class Solution {
    public String stringHash(String s, int k) {
        int n=s.length();
        StringBuilder result=new StringBuilder("");
        for(int i=0;i<n;i+=k){
            int count=0;
            for(int j=i;j<i+k;j++){
                count+=s.charAt(j)-'a';
            }
            int mod=count%26;
            int x=mod+'a';
            char c=(char)x;
            result.append(c);
        }
        return result.toString();
    }
}
