class Task implements Comparable<Task> {
    int frequency;
    int time;

    Task(int f, int t){
        frequency = f;
        time=t;
    }

    public int compareTo(Task that){
        return that.frequency-this.frequency;
    }
}
class Solution {
    public int leastInterval(char[] tasks, int n) {
        
        HashMap<Character,Integer> mp =new HashMap<>();

        for( char ch:tasks){
            mp.put(ch,mp.getOrDefault(ch,0)+1);
        }

        // using max heap-PQ

        PriorityQueue<Task> pq = new PriorityQueue<>();


        for(Character ch : mp.keySet()){
            int freq  =mp.get(ch);
            pq.offer(new Task(freq,0));
        }

        Queue<Task> queue = new LinkedList<>();

        int time =0;

        while(!queue.isEmpty() || !pq.isEmpty()){
            time++;

            if(!pq.isEmpty()){
                Task task = pq.poll();
                task.frequency--;

                if(task.frequency>0){
                    task.time = time+n; 
                    queue.offer(task); 
                }
            }

           while(!queue.isEmpty() && queue.peek().time == time){
            pq.offer(queue.poll());
           } 
        }

return time;


    }
}