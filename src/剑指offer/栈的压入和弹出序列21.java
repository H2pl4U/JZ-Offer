package 剑指offer;

import java.util.Stack;

/**
 * 输入两个整数序列，第一个序列表示栈的压入顺序，请判断第
 * 二个序列是否可能为该栈的弹出顺序。假设压入栈的所有数字
 * 均不相等。例如序列1,2,3,4,5是某栈的压入顺序，序列4,5,
 * 3,2,1是该压栈序列对应的一个弹出序列，但4,3,5,1,2就不
 * 可能是该压栈序列的弹出序列。（注意：这两个序列的长度是相等的）
 * @author ilovejava1314
 */
public class 栈的压入和弹出序列21 {

	public static void main(String[] args) {
		int[] pushA = {1,2,3,4,5};
		int[] popA = {4,3,5,1,2};
		System.out.println(IsPopOrder(pushA, popA));
	}

	
	/*
	 * 思路:首先，若有空数组，则直接返回false
	 * 然后循环将pushA中的元素压入栈中，在此
	 * 过程中，如果本次元素和popA中某元素相等，
	 * 那么此元素出栈，如此一来，只需判断循环后
	 * 是否为空栈即可。
	 * -----------------------------------------------
	 * 运行时间：15ms
	 * 占用内存：9348k
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
