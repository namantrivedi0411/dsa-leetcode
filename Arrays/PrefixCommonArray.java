class Solution {
    public int[] findThePrefixCommonArray(int[] A, int[] B) {
        Set<Integer> setA=new HashSet<>();
        int[] common=new int[A.length];
        int count=0;
        for(int i=0;i<B.length;i++){
            setA.add(A[i]);
            for(int j=0;j<=i;j++){
                if(setA.contains(B[j])) count++;
            }
            common[i]=count;
            count=0;
        }
        return common;
    }
}
