class Solution {
    public List<String> validStrings(int n) {
        List<String> list=new ArrayList<>();
        for(int i=0;i<Math.pow(2,n);i++){
            String binary=Integer.toBinaryString(i);
            String b=String.format("%"+n+"s",binary).replace(' ','0');
            int j=1;
            while(j<b.length()){
                if(b.charAt(j)=='0' && b.charAt(j-1)=='0') break;
                j++;
            }
            if(j==b.length()) list.add(b);
        }
        return list;
    }
}
