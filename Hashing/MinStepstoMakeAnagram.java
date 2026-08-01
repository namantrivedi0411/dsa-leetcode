class Solution {
    public int minSteps(String s, String t) {
        int diff=0;
        Map<Character,Integer> sMap=new HashMap<>();
        Map<Character,Integer> tMap=new HashMap<>();
        for(int i=0;i<s.length();i++){
            if(sMap.containsKey(s.charAt(i))){
                sMap.put(s.charAt(i),sMap.get(s.charAt(i))+1);
            }
            else sMap.put(s.charAt(i),1);
            if(tMap.containsKey(t.charAt(i))){
                tMap.put(t.charAt(i),tMap.get(t.charAt(i))+1);
            }
            else tMap.put(t.charAt(i),1);
        }
        for(int i=97;i<=122;i++){
            char c=(char)i;
            if(sMap.containsKey(c) && tMap.containsKey(c)){
                if(tMap.get(c)>sMap.get(c)){
                    diff+=Math.abs(sMap.get(c)-tMap.get(c));
                }
            }
            else if(tMap.containsKey(c) && !sMap.containsKey(c)){
                diff+=tMap.get(c);
            }
        }
        return diff;
    }
}
