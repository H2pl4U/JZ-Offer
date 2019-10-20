package ��ָoffer;

import java.util.ArrayList;
import java.util.Stack;


/*
 * ����һ������������ֵ��β��ͷ��˳�򷵻�һ��ArrayList��
 * @author ilovejava1314
 */
class ListNode {
    int val;
    ListNode next = null;
    ListNode(int val) {
        this.val = val;
    }
}

public class ��β��ͷ��ӡ����03 {

	/*
	  * ˼·һ
	  * ��������ArrayList��һ��������������Ԫ��
	  * ��һ������������������Ԫ��,����һ��
	 *----------------------
	  * ����ʱ�䣺24ms
	  * ռ���ڴ棺9116k
	 */
	public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		ArrayList<Integer> list1 = new ArrayList<Integer>();
		if(listNode==null) {
			return list;
		}
		while(listNode!=null) {
			list.add(listNode.val);
		    listNode=listNode.next;
		}
		for(int i = list.size()-1;i>=0;i--) {
			list1.add(list.get(i));
		}
		return list1;
	}
	
	/*
	  * ����ջ���Ƚ�������ʣ�������Ԫ�����˴���ջ��
	  * ����ArrayList���ճ�ջԪ��,����һ��
	 * -------------------------
	  * ����ʱ�䣺29ms
	  * ռ���ڴ棺9500k
	 */
	public ArrayList<Integer> printListFromTailToHead2(ListNode listNode) {
		Stack<Integer> stack = new Stack<Integer>();
		while(listNode!=null) {
			stack.add(listNode.val);
			listNode = listNode.next;
		}
		ArrayList<Integer> list = new ArrayList<Integer>();
		while(!stack.isEmpty()) {
			list.add(stack.pop());
		}
		return list;
    }
	
	/*
	  * ���õݹ�ʵ�֣�������ָ��listNodeͷ����
	  * 
	 * -------------------------
	  * ����ʱ�䣺24ms
	  * ռ���ڴ棺9440k
	 */
	public ArrayList<Integer> printListFromTailToHead3(ListNode listNode) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		ListNode pNode = listNode;
		if(pNode!=null) {
			if(pNode.next!=null) {
				list=printListFromTailToHead3(pNode.next);
			}
			list.add(pNode.val);
		}
		return list;
	}
	

}
