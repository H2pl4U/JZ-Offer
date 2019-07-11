package ��ָoffer;

import java.util.Stack;

/**
 * ���������������У���һ�����б�ʾջ��ѹ��˳�����жϵ�
 * ���������Ƿ����Ϊ��ջ�ĵ���˳�򡣼���ѹ��ջ����������
 * ������ȡ���������1,2,3,4,5��ĳջ��ѹ��˳������4,5,
 * 3,2,1�Ǹ�ѹջ���ж�Ӧ��һ���������У���4,3,5,1,2�Ͳ�
 * �����Ǹ�ѹջ���еĵ������С���ע�⣺���������еĳ�������ȵģ�
 * @author ilovejava1314
 */
public class ջ��ѹ��͵�������21 {

	public static void main(String[] args) {
		int[] pushA = {1,2,3,4,5};
		int[] popA = {4,3,5,1,2};
		System.out.println(IsPopOrder(pushA, popA));
	}

	
	/*
	 * ˼·:���ȣ����п����飬��ֱ�ӷ���false
	 * Ȼ��ѭ����pushA�е�Ԫ��ѹ��ջ�У��ڴ�
	 * �����У��������Ԫ�غ�popA��ĳԪ����ȣ�
	 * ��ô��Ԫ�س�ջ�����һ����ֻ���ж�ѭ����
	 * �Ƿ�Ϊ��ջ���ɡ�
	 * -----------------------------------------------
	 * ����ʱ�䣺15ms
	 * ռ���ڴ棺9348k
	 */
	public static boolean IsPopOrder(int [] pushA,int [] popA) {
		if(pushA.length==0||popA.length==0) return false;
		Stack<Integer> stack = new Stack<Integer>();
		int j=0;
		for (int i = 0; i < popA.length; i++) {
			stack.push(pushA[i]);
			while(j<popA.length && stack.peek()==popA[j]) {
				stack.pop();
				j++;
			}
		}
		return stack.isEmpty()==true;
    }
}
