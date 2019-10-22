package ��ָoffer;

import java.util.Stack;

/**
 * ����һ��������ת��������������ı�ͷ��
 * @author ilovejava1314
 */
public class ��ת����15 {

	public static void main(String[] args) {
		
	}
	
	/*
	 * ˼·:��������ListNode��һ������head.next����֤�ȶ�ѭ��,��һ������Ϊpre=null,
	 * ʹ��head.nextʼ��ָ��pre,�ٸ�preָ��ǰhead.
	 * ��ѭ����� pre�����Ϊ��5->4->3->2->1->null,pre��Ϊ��ת����
	 * -----------------------------------------------
	 * ����ʱ�䣺29ms
	 * ռ���ڴ棺9588k
	 */
	public static ListNode ReverseList(ListNode head) {
		if(head==null) return null;
		ListNode next = null;
		ListNode pre = null;
		while(head!=null) {
			//next����head���¸��ڵ�
			next = head.next;
			//head����һ���ڵ�ʼ��ָ��pre
			head.next=pre;
			//preָ��ǰhead�ڵ�
			pre = head;
			//��һ���ڵ�ѭ��
			head = next;
		}
		return pre;
		
    }
	
	/*
	 * ˼·:����ջ���Ƚ����ԭ��,�Ƚ�����ѹ��ջ��(����)
	 * ȫ��ѹ���,�ٳ�ջ��ֵ������,������ʵ���˷�ת����
	 * -----------------------------------------------
	 * ����ʱ�䣺39ms
	 * ռ���ڴ棺9280k
	 */
	public static ListNode ReverseList2(ListNode head) {
		if(head==null) return null;
		Stack<ListNode> stack = new Stack<>();
		ListNode rev = head;
		while(rev.next!=null) {
			stack.push(rev);
			rev=rev.next;
		}
		head=rev;
		while(!stack.isEmpty()) {
			rev.next=stack.peek();
			rev=rev.next;
			stack.pop();
		}
		head.next=null;
		return head;
	}

}
