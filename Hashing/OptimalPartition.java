class Solution {
    public int partitionString(String s) {
        int count=1;
        Set<Character> subStr=new HashSet<>();
        for(int i=0;i<s.length();i++){
            if(!subStr.contains(s.charAt(i))) subStr.add(s.charAt(i));
            else{
                count++;
                subStr.clear();
                subStr.add(s.charAt(i));
            }
        }
        return count;
    }
}
