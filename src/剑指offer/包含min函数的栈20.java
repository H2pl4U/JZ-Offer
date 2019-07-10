package 剑指offer;

import java.util.Stack;


/**
 * 定义栈的数据结构，请在该类型中实现一个能够得到栈中所含最小元素的min函数
 * （时间复杂度应为O（1））。
 * @author ilovejava1314
 */
public class 包含min函数的栈20 {

	/*
	 * 思路:定义两个栈，一个栈data存放所有数据，一个栈min存放递减数据
	 * 如:data进栈:5,4,3,14,15,16,17,2,8,1
	 * 	  min进栈:5,4,3,null,null,null,null,2,null,1
	 * 	最小值为min栈栈顶，只需peek即可返回最小值
	 * -----------------------------------------------
	 * 运行时间：21ms
	 * 占用内存：9048k
	 */
	Stack<Integer> data = new Stack<Integer>();
	Stack<Integer> min = new Stack<Integer>();
	Integer temp = null;
	public void push(int node) {
        if(temp!=null) {
        	if(node<temp) {
        		temp=node;
        		min.push(node);
        	}
        	data.push(node);
        }else {
        	temp=node;
        	data.push(node);
        	min.push(node);
        }
    }
    
    public void pop() {
    	int num1 = data.pop();
    	int num2 = min.pop();
    	if(num1!=num2) {
    		min.push(num2);
    	}
    }
    
    public int top() {
		return data.peek();
    }
    
    public int min() {
		return min.peek();
    }

}
