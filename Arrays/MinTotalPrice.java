class Solution {
    public double minPrice(int[] prices, int[] discounts) {
        Arrays.sort(prices);
        Arrays.sort(discounts);
        int i=prices.length-1;
        int j=discounts.length-1;
        List<Double> l=new ArrayList<>();
        while(i>=0 && j>=0){
            l.add(((double)prices[i]*(100-(double)discounts[j]))/100);
            i--;j--;
        }
        while(i>=0){
            l.add((double)prices[i]);
            i--;
        }
        double total=0;
        for(int k=0;k<l.size();k++){
            total+=l.get(k);
        }
        return total;
    }
}
