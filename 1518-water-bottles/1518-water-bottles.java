class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {
        int drunkBottle = numBottles;
        while(numBottles>=numExchange){
            int exchanged = numBottles/numExchange; 
            int remain= numBottles%numExchange; 

            drunkBottle = drunkBottle+exchanged;
            numBottles = exchanged+remain;
        }

        return drunkBottle; 
    }
} 