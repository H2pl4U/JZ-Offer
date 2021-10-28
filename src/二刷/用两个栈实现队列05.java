package 二刷;

import java.util.Stack;

public class 用两个栈实现队列05 {
	
	/**
	 * 运行时间：12ms
	 * 占用内存：9272k
	 */
	Stack<Integer> stack1 = new Stack<Integer>(); 	
	Stack<Integer> stack2 = new Stack<Integer>(); 	
	public void push(int node) {
		stack1.push(node);
	}
	
	public int pop() {
		if(!stack2.isEmpty()) {
			return stack2.pop();
		}else {
			while(!stack1.isEmpty()) {
				stack2.push(stack1.pop());
			}
			return stack2.pop();
		}
	}

}
