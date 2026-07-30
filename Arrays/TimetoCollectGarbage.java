class Solution {
    public int garbageCollection(String[] garbage, int[] travel) {
        int glass=0;int paper=0;int metal=0;
        int i=0;
        int gIdx=-1;int pIdx=-1; int mIdx=-1;
        while(i<garbage.length){
            for(int j=0;j<garbage[i].length();j++){
                if(garbage[i].charAt(j)=='G'){
                    glass++;
                    gIdx=i;
                }
                else if(garbage[i].charAt(j)=='P'){
                    paper++;
                    pIdx=i;
                }
                else{
                    metal++;
                    mIdx=i;
                }
            }
            i++;
        }
        if(mIdx>0){
            for(int j=0;j<mIdx;j++) metal+=travel[j];
        }
        if(pIdx>0){
            for(int j=0;j<pIdx;j++) paper+=travel[j];
        }
        if(gIdx>0){
            for(int j=0;j<gIdx;j++) glass+=travel[j];
        }
        return paper+glass+metal;
    }
}
