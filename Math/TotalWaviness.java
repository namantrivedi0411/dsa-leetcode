class Solution {
    public int totalWaviness(int num1, int num2) {
        int wavy=0;
        for(int i=num1;i<=num2;i++){
            String num=Integer.toString(i);
            int j=1;
            while(j<num.length()-1){
                int dig=num.charAt(j)-'0';
                int prev=num.charAt(j-1)-'0';
                int next=num.charAt(j+1)-'0';
                if((dig>prev && dig>next) || (dig<prev && dig<next)) wavy++;
                j++;
            }
        }
        return wavy;
    }
}
