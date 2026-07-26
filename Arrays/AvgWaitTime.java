class Solution {
    public double averageWaitingTime(int[][] customers) {
        double wait=customers[0][1];
        int order=customers[0][0]+customers[0][1];
        for(int i=1;i<customers.length;i++){
            if(customers[i][0]>order){
                order=customers[i][0];
            }
            order+=customers[i][1];
            wait+=order-customers[i][0];
        }
        return wait/customers.length;
    }
}
