class Solution {
    public String findCommonResponse(List<List<String>> responses) {
        List<HashSet<String>> l=new ArrayList<>();
        for(List<String> list:responses){
            HashSet<String> h=new HashSet<>(list);
            l.add(h);
        }
        HashMap<String,Integer> count=new HashMap<>();
        int max=0;
        for(HashSet<String> set:l){
            for(String s:set){
                if(count.containsKey(s)){
                    count.put(s,count.get(s)+1);
                }
                else count.put(s,1);
                max=Math.max(max,count.get(s));
            }
        }
        StringBuilder sb=new StringBuilder("");
        for(Map.Entry<String,Integer> entry:count.entrySet()){
            if(entry.getValue().equals(max)){
                if(sb.length()==0) sb.append(entry.getKey());
                else{
                    if(entry.getKey().compareTo(sb.toString())<=0){
                        sb.setLength(0);
                        sb.append(entry.getKey());
                    }
                }
            }
        }
        return sb.toString();
    }
}
