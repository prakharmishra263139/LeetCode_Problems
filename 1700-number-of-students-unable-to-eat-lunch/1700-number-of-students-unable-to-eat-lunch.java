class Solution {
    public int countStudents(int[] students, int[] sandwiches) {
        
        int cs =0;
        int ss=0;
        for(int choice:students){
            if(choice==0){
                cs++;
            }else{
                ss++;
            }
        }

        for(int sandwich :sandwiches){
            if(sandwich==0  && cs==0){
                return ss;
            }

             if(sandwich==1 && ss==0){
                return cs;
            }

            if(sandwich==0){
                cs--;
            }else{
                ss--;
            }
        }
        return  0;
    }
}