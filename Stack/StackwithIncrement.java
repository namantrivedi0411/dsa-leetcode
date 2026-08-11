class CustomStack {
    int len;
    Stack<Integer> s;

    public CustomStack(int maxSize) {
        s=new Stack<>();
        len=maxSize;
    }
    
    public void push(int x) {
        if(s.size()<len){
            s.push(x);
        }
    }
    
    public int pop() {
        if(!s.isEmpty()){
            return s.pop();
        }
        else return -1;
    }
    
    public void increment(int k, int val) {
        int limit=Math.min(k,s.size());
        for(int i=0;i<limit;i++){
            int x=s.get(i)+val;
            s.set(i,x);
        }
    }
}
