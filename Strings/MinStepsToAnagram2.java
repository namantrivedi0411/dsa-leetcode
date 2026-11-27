class Solution {
    public int minSteps(String s, String t) {
        int steps=0;
        int[] freq=new int[26];
        for(int i=0;i<s.length();i++){
            freq[s.charAt(i)-'a']++;
        }
        for(int i=0;i<t.length();i++){
            freq[t.charAt(i)-'a']--;
        }
        for(int count:freq){
            steps+=Math.abs(count);
        }
        return steps;
    }
}
