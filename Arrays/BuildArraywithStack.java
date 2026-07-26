class Solution {
    public List<String> buildArray(int[] target, int n) {
        List<String> list=new ArrayList<>();
        int prev=1;
        for(int i=0;i<target.length;i++){
            if(target[i]==prev) list.add("Push");
            else{
                int j=target[i]-prev;
                if(prev==1 && i==0){
                    for(int k=0;k<j;k++) list.add("Push");
                    for(int k=0;k<j;k++) list.add("Pop");
                    list.add("Push");
                }
                else{
                    if(j==1) list.add("Push");
                    else{
                        for(int k=0;k<j-1;k++) list.add("Push");
                        for(int k=0;k<j-1;k++) list.add("Pop");
                        list.add("Push");
                    }
                }
                prev=target[i];
            }
        }
        return list;
    }
}
