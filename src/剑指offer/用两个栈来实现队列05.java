package 剑指offer;

import java.util.Stack;


/**
 * 用两个栈来实现一个队列，完成队列的Push和Pop操作。
 *  队列中的元素为int类型。
 * @author ilovejava1314
 */
public class 用两个栈来实现队列05 {

	public static void main(String[] args) {
		
	}
	
    Stack<Integer> stack1 = new Stack<Integer>();
    Stack<Integer> stack2 = new Stack<Integer>();
    
	/*
	  * 思路:
	  * 首先明确队列是先进先出原则，而栈是先进后出原则
	  * 利用两个栈，栈1保存进队的元素，通过栈2找出最先
	  * 进队的元素并返回。
	 *----------------------
	  * 运行时间：15ms
	  * 占用内存：9312k
	 */
    public void push(int node) {
        stack1.push(node);
    }
    
    public int pop() {
    	//若栈2为空，则将栈1元素都压入栈2中，并弹出栈2的栈顶元素
    	if(stack2.isEmpty()) {
    		while(!stack1.isEmpty()) {
    			int top = stack1.peek(); //peek和pop都是取出栈顶，但是peek不会删除栈顶
    			stack1.pop();
    			stack2.push(top);
    		}
    	}
    	//若栈2还有元素，直接出栈顶
    	int res = stack2.peek();
    	stack2.pop();
		return res;
    }

}
