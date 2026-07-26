class Solution {
    public String removeStars(String s) {
        StringBuilder star=new StringBuilder("");
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='*'){
                if(star.length()>0) star.deleteCharAt(star.length()-1);
            }
            else star.append(s.charAt(i));
        }
        return star.toString();
    }
}
