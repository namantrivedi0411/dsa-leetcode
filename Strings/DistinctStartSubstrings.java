class Solution {
    public int maxDistinct(String s) {
        Set<Character> set=new LinkedHashSet<>();
        for(int i=0;i<s.length();i++){
            set.add(s.charAt(i));
        }
        return set.size();
    }
};
