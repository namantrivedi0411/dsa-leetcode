class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> list=new ArrayList<>();
        Set<String> set=new HashSet<>();
        for(int i=0;i<strs.length;i++){
            String str1=strs[i];
            if(!set.contains(str1)){
                List<String> anag=new ArrayList<>();
                anag.add(str1);
                set.add(str1);
                for(int j=0;j<strs.length;j++){
                    if(strs[j].length()==str1.length() && i!=j){
                        char[] arr1=str1.toCharArray();
                        char[] arr2=strs[j].toCharArray();
                        Arrays.sort(arr1);
                        Arrays.sort(arr2);
                        if(Arrays.equals(arr1,arr2)){
                            anag.add(strs[j]);
                            set.add(strs[j]);
                        }
                    }
                }
                list.add(anag);
            }
        }
        return list;
    }
}
