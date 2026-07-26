class Solution {
    public int passwordStrength(String password) {
        Set<Character> pass=new HashSet<>();
        int point=0;
        for(int i=0;i<password.length();i++){
            char c=password.charAt(i);
            if(!pass.contains(c)){
                pass.add(c);
                if(c>=97 && c<=122) point+=1;
                else if(c>=65 && c<=90) point+=2;
                else if(c>=48 && c<=57) point+=3;
                else if(c==33 || c==35 || c==36 || c==64) point+=5;
            }
        }
        return point;
    }
}
