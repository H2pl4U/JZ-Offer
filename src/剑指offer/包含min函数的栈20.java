package ��ָoffer;

import java.util.Stack;


/**
 * ����ջ�����ݽṹ�����ڸ�������ʵ��һ���ܹ��õ�ջ��������СԪ�ص�min����
 * ��ʱ�临�Ӷ�ӦΪO��1������
 * @author ilovejava1314
 */
public class ����min������ջ20 {

	/*
	 * ˼·:��������ջ��һ��ջdata����������ݣ�һ��ջmin��ŵݼ�����
	 * ��:data��ջ:5,4,3,14,15,16,17,2,8,1
	 * 	  min��ջ:5,4,3,null,null,null,null,2,null,1
	 * 	��СֵΪminջջ����ֻ��peek���ɷ�����Сֵ
	 * -----------------------------------------------
	 * ����ʱ�䣺21ms
	 * ռ���ڴ棺9048k
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
