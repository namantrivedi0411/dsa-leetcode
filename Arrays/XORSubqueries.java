class Solution {
    public int[] xorQueries(int[] arr, int[][] queries) {
        int q=queries.length;int a=arr.length;
        int[] xor=new int[a];
        xor[0]=arr[0];
        for(int i=1;i<a;i++){
            xor[i]=xor[i-1]^arr[i];
        }
        int[] ans=new int[q];
        for(int i=0;i<q;i++){
            int l=queries[i][0];
            int r=queries[i][1];
            if(l==0) ans[i]=xor[r];
            else ans[i]=xor[r]^xor[l-1];
        }
        return ans;
    }
}
