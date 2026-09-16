class Solution {
    public String intToRoman(int num) {
        int[] val={1000,900,500,400,100,90,50,40,10,9,5,4,1};
        String[] sym={"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};
        StringBuilder res=new StringBuilder("");
        while(num>0){
            int i=0;
            while(i<val.length){
                if(val[i]<=num) break;
                i++;
            }
            int times=num/val[i];
            while(times>0){
                res.append(sym[i]);
                times--;
            }
            num=num%val[i];
        }
        return res.toString();
    }
}
