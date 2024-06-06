class Solution {
    public boolean isNStraightHand(int[] hand, int groupSize) {
        TreeMap<Integer,Integer> mp = new TreeMap<>();

        if(hand.length%groupSize!=0){
            return false;
        }
        for(int i=0;i<hand.length;i++){
            mp.put(hand[i],mp.getOrDefault(hand[i],0)+1);
        }

        while(mp.size()>0){
            int current = mp.entrySet().iterator().next().getKey();
            for(int i=0;i<groupSize;i++){
                int card = current+i;
                if(!mp.containsKey(card)) return false;

                mp.put(card,mp.get(card)-1);

                if(mp.get(card)==0){
                    mp.remove(card);
                }
            }
        }

        return true;

    }
}