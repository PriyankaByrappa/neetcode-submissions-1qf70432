class MinStack {
   long min;
   std::stack<long>stack;
public:
    MinStack() {
        // stack=new Stack<>();
    }
    
    void push(int val) {
        if(stack.empty())
        {
            stack.push(0);
            min=val;
        }
        else
        {
            stack.push(val-min);
            if(val<min)  min=val;
        }
        
    }
    
    void pop() {
        if(stack.empty()) return;
        long pop=stack.top();
        stack.pop();
        if(pop<0) min=min-pop;
        
    }
    
    int top() {
        long top=stack.top();
        if(top>0)
        {
            return (int) (top+min);
        }
        else
        {
            return (int) min;
        }
        
    }
    
    int getMin() {
        return (int ) min;
        
    }
};
