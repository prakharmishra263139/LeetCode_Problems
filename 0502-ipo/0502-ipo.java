class Project implements Comparable<Project> {
    int profit;
    int capital;

    Project(int profit, int capital){
        this.profit=profit;
        this.capital=capital;
    }

    public int compareTo(Project that){
        return this.capital-that.capital;
    }


}

class Solution {
    public int findMaximizedCapital(int k, int w, int[] profits, int[] capital) {
        PriorityQueue<Project> minPq = new PriorityQueue<>();
        PriorityQueue<Integer> maxPq = new PriorityQueue<>(Collections.reverseOrder());

        int n = capital.length;

        for(int i=0;i<n;i++){
            minPq.offer(new Project(profits[i],capital[i]));
        }

        while(k>0){
            while(!minPq.isEmpty() && minPq.peek().capital<=w){
                maxPq.offer(minPq.poll().profit);
            }

            if(maxPq.isEmpty()){
                break;
            }

            w += maxPq.poll();
            k--;
        }

        return w;
    }
}