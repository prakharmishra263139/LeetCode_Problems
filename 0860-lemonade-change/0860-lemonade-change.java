class Solution {
    public boolean lemonadeChange(int[] bills) {
        int countFive=0;
        int countTen=0;

        for(int bill:bills){
            if(bill==5){
                countFive++;
            }else if(bill==10){
                countTen++;
                countFive--;
            }else if(countTen>0){
                countTen--;
                countFive--;
            }else{
                countFive =countFive-3;
            }

            if(countFive<0){
                return false;
            }
        }

        return true;
    }
}