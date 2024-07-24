class Solution {
    public int[] convert(int mapping[], int nums[]){
        int n = nums.length;
        int sys[] = new int[n];
        for(int j=0;j<n;j++){
            int num=nums[j];
            if(num==0){
                sys[j]=mapping[0];
                continue;
            }

            int i=0;
            int res=0;

            while(num>0){
                int digit = num%10;//digit extract
                int newD = mapping[digit];//conversion
                res=newD*(int)Math.pow(10,i)+res;//formation
                num = num/10;//removal
                i++;//next digit
            }
            sys[j]=res;
           
     
     }
     return sys;
    }
    public int[] sortJumbled(int[] mapping, int[] nums) {

        int n= nums.length;
        int  sys[] = convert(mapping,nums);
        Integer index[] = new Integer[n];

        for(Integer i=0;i<n;i++){
            index[i]=i;
        }

        Arrays.sort(index,new Comparator<Integer>(){
            public int compare(Integer a ,Integer b){
                return sys[a]-sys[b];
            }

        });

        int res[] = new int[n];
        int i=0;

        for(int ind:index){
            res[i]=nums[ind];
            i++;
        }
        return res;
    }
}