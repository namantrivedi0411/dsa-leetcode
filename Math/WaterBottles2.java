class Solution {
    public int maxBottlesDrunk(int numBottles, int numExchange) {
        int full=0;
        int ex=numExchange;int num=numBottles;
        while(num>=ex){
            num-=ex;
            ex++;
            full++;
            if(num<ex){
                num+=full;
                numBottles+=full;
                full=0;
            }
        }
        return numBottles;
    }
}
