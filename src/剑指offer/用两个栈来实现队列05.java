package ��ָoffer;

import java.util.Stack;


/**
 * ������ջ��ʵ��һ�����У���ɶ��е�Push��Pop������
 *  �����е�Ԫ��Ϊint���͡�
 * @author ilovejava1314
 */
public class ������ջ��ʵ�ֶ���05 {

	public static void main(String[] args) {
		
	}
	
    Stack<Integer> stack1 = new Stack<Integer>();
    Stack<Integer> stack2 = new Stack<Integer>();
    
	/*
	  * ˼·:
	  * ������ȷ�������Ƚ��ȳ�ԭ�򣬶�ջ���Ƚ����ԭ��
	  * ��������ջ��ջ1������ӵ�Ԫ�أ�ͨ��ջ2�ҳ�����
	  * ���ӵ�Ԫ�ز����ء�
	 *----------------------
	  * ����ʱ�䣺15ms
	  * ռ���ڴ棺9312k
	 */
    public void push(int node) {
        stack1.push(node);
    }
    
    public int pop() {
    	//��ջ2Ϊ�գ���ջ1Ԫ�ض�ѹ��ջ2�У�������ջ2��ջ��Ԫ��
    	if(stack2.isEmpty()) {
    		while(!stack1.isEmpty()) {
    			int top = stack1.peek(); //peek��pop����ȡ��ջ��������peek����ɾ��ջ��
    			stack1.pop();
    			stack2.push(top);
    		}
    	}
    	//��ջ2����Ԫ�أ�ֱ�ӳ�ջ��
    	int res = stack2.peek();
    	stack2.pop();
		return res;
    }

}
