class Solution {
    public int numberOfBeams(String[] bank) {
        List<Integer> laser=new ArrayList<>();
        for(int i=0;i<bank.length;i++){
            int count=0;
            for(int j=0;j<bank[i].length();j++){
                if(bank[i].charAt(j)=='1') count++;
            }
            if(count!=0) laser.add(count);
        }
        int total=0;
        for(int i=1;i<laser.size();i++){
            total+=laser.get(i-1)*laser.get(i);
        }
        return total;
    }
}
