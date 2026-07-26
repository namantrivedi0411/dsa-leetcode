class Solution {
    public int sumOfPrimesInRange(int n) {
        int r=0;int num=n;
        while(num!=0){
            r*=10;
            r+=num%10;
            num/=10;
        }
        int min=Math.min(n,r);
        int max=Math.max(n,r);
        int sum=0;
        for(int i=min;i<=max;i++){
            int j=2;
            while(j*j<=i){
                if(i%j==0) break;
                j++;
            }
            if(j*j>i && i!=1) sum+=i; 
        }
        return sum;
    }
