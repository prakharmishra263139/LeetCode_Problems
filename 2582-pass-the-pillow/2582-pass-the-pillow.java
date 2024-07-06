class Solution {
    public int passThePillow(int n, int time) {
        int current=0;
        int position =1;

        boolean direction =false;

        while(current<time){
            if(!direction){
                position = position+1;
            }else{
                position=position-1;
            } 

            if(position==1 || position==n){
                direction = !direction;
            }
            current++;
        } 

        return position;
    }
}