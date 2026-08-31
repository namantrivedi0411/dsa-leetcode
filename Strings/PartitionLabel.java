class Solution {
    public List<Integer> partitionLabels(String s) {
        int[] last=new int[26];
        for(int i=0;i<s.length();i++){
            last[s.charAt(i)-'a']=i;
        }
        List<Integer> label=new ArrayList<>();
        int end=0;int i=0;int j=0;
        while(i<s.length()){
            char c=s.charAt(i);
            j=i;
            end=last[c-'a'];
            while(j<=end && j<s.length()){
                if(last[s.charAt(j)-'a']<=end){
                    j++;
                }
                else{
                    end=last[s.charAt(j)-'a'];
                    j++;
                }
            }
            label.add(j-i);
            i=j;
        }
        return label;
    }
}
