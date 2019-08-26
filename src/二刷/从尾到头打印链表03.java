package ��ˢ;

import java.util.ArrayList;
import java.util.Stack;

class ListNode {
	int val;
	ListNode next = null;
	ListNode(int val) {
		this.val = val;
	}
}


public class ��β��ͷ��ӡ����03 {

	/*
	 * ac 100%
	 * ����ʱ�䣺17ms
	 * ռ���ڴ棺9560k
	 */
	public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		Stack<Integer> stack = new Stack<Integer>();
		while(listNode!=null) {
			stack.add(listNode.val);
			listNode=listNode.next;
		}
		while(!stack.isEmpty()) {
			list.add(stack.pop());
		}
		return list;
	}
}
