package 剑指offer;

import java.util.ArrayList;
import java.util.Stack;


/*
 * 输入一个链表，按链表值从尾到头的顺序返回一个ArrayList。
 * @author ilovejava1314
 */
class ListNode {
    int val;
    ListNode next = null;
    ListNode(int val) {
        this.val = val;
    }
}

public class 从尾到头打印链表03 {

	/*
	  * 思路一
	  * 创建两个ArrayList，一个用来接收链表元素
	  * 另一个来接收链表逆序后的元素,性能一般
	 *----------------------
	  * 运行时间：24ms
	  * 占用内存：9116k
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
	  * 利用栈的先进后出性质，将链表元素依此存入栈中
	  * 再用ArrayList接收出栈元素,性能一般
	 * -------------------------
	  * 运行时间：29ms
	  * 占用内存：9500k
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
	  * 利用递归实现，新链表指向listNode头部，
	  * 
	 * -------------------------
	  * 运行时间：24ms
	  * 占用内存：9440k
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
