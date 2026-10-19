class Solution {
    public int lengthOfLongestSubstring(String s) {
        Map<Character,Integer> map=new HashMap<>();
        int max=0;int count=0;
        for(int i=0;i<s.length();i++){
            if(!map.containsKey(s.charAt(i))){
                map.put(s.charAt(i),i);
                count++;
            }
            else{
                max=Math.max(max,count);
                count=0;
                i=map.get(s.charAt(i));
                map.clear();
            }
        }
        max=Math.max(max,count);
        return max;
    }
}
