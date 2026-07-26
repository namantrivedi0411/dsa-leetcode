class Solution {
    public String sortVowels(String s) {
        List<Character> vowels=new ArrayList<>();
        for(int i=0;i<s.length();i++){
            char c=Character.toLowerCase(s.charAt(i));
            if(c=='a' | c=='e' | c=='i' | c=='o' | c=='u') vowels.add(s.charAt(i));
        }
        vowels.sort(Comparator.naturalOrder());
        int j=0;
        StringBuilder t=new StringBuilder(s);
        for(int i=0;i<t.length();i++){
            char c=Character.toLowerCase(t.charAt(i));
            if(c=='a' | c=='e' | c=='i' | c=='o' | c=='u'){
                t.setCharAt(i,vowels.get(j++));
            }
        }
        return t.toString();
    }
}
