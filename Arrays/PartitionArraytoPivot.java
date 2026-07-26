class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        List<Integer> listLT=new ArrayList<>();
        List<Integer> listGT=new ArrayList<>();
        List<Integer> listEQ=new ArrayList<>();
        for(int num:nums){
            if(num<pivot) listLT.add(num);
            else if(num>pivot) listGT.add(num);
            else listEQ.add(num);
        }
        listLT.addAll(listEQ);
        listLT.addAll(listGT);
        int[] nums2=listLT.stream().mapToInt(i->i).toArray();
        return nums2;
    }
}
