class Solution {
    public List<String> stringSequence(String target) {
        List<String> screen=new ArrayList<>();
        StringBuilder sb=new StringBuilder("");
        for(int i=0;i<target.length();i++){
            sb.append("a");
            screen.add(sb.toString());
            int shift=target.charAt(i)-sb.charAt(i);
            for(int j=0;j<shift;j++){
                if(sb.charAt(i)=='z'){
                    sb.setCharAt(i,'a');
                    screen.add(sb.toString());
                }
                else{
                    int x=(int)(sb.charAt(i)+1);
                    char c=(char)x;
                    sb.setCharAt(i,c);
                    screen.add(sb.toString());
                }
            }
        }
        return screen;
    }
}
