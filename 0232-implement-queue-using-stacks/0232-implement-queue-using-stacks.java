class MyQueue {
    private Deque<Integer>stack1= new ArrayDeque<>();
    private Deque<Integer>stack2= new ArrayDeque<>();
    public MyQueue() {
        
    }
    public void push(int x) {
        stack1.push(x);
    }
    public int pop() {
        move();
        return stack2.pop();
    } 
    public int peek() {
        move();
        return stack2.peek();
    }
    public boolean empty() {
        return stack1.isEmpty()&&stack2.isEmpty();
    }

    private void move(){
        while(stack2.isEmpty()){
            while(!stack1.isEmpty()){
                stack2.push(stack1.pop());
            }
        }
    }
}

