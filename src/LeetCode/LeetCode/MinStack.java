package LeetCode;

import java.util.ArrayList;
import java.util.Stack;

public class MinStack {
    Stack<Integer> stack = new Stack<Integer>();
    ArrayList<Integer> min_stack = new ArrayList<Integer>();

    public MinStack() {

    }

    public void push(int val) {

        stack.push(val);
        if (!(min_stack.isEmpty())) {
            int lastmin = min_stack.get(min_stack.size() - 1);
            int min = Math.min(lastmin, val);
            min_stack.add(min);
        } else {
            min_stack.add(val);
        }

    }

    public void pop() {
        stack.pop();
        min_stack.remove(min_stack.size() - 1);
    }

    public int top() {
        return stack.peek();
    }

    public int getMin() {
        return min_stack.get(min_stack.size() - 1);
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */
// ===================================== python solution
// ============================================== //
/**
 * class MinStack:
 * 
 * def __init__(self):
 * self.my_stack=[]
 * self.my_list=[]
 * 
 * def push(self, val: int) -> None:
 * self.my_stack.append(val)
 * if self.my_list:
 * my_last = self.my_list[-1]
 * my_min= min(my_last,val)
 * self.my_list.append(my_min)
 * else:
 * self.my_list.append(val)
 * 
 * 
 * 
 * def pop(self) -> None:
 * self.my_list.pop()
 * self.my_stack.pop()
 * 
 * 
 * def top(self) -> int:
 * val = self.my_stack.pop()
 * self.my_stack.append(val)
 * return val
 * 
 * def getMin(self) -> int:
 * return self.my_list[-1]
 * 
 * 
 * 
 * # Your MinStack object will be instantiated and called as such:
 * # obj = MinStack()
 * # obj.push(val)
 * # obj.pop()
 * # param_3 = obj.top()
 * # param_4 = obj.getMin()
 */