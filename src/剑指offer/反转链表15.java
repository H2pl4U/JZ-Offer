package 剑指offer;

import java.util.Stack;

/**
 * 输入一个链表，反转链表后，输出新链表的表头。
 * @author ilovejava1314
 */
public class 反转链表15 {

	public static void main(String[] args) {
		
	}
	
	/*
	 * 思路:借助两个ListNode，一个保存head.next来保证稳定循环,另一个名称为pre=null,
	 * 使得head.next始终指向pre,再给pre指向当前head.
	 * 即循环完后 pre链表变为了5->4->3->2->1->null,pre则为反转链表
	 * -----------------------------------------------
	 * 运行时间：29ms
	 * 占用内存：9588k
	 */
	public static ListNode ReverseList(ListNode head) {
		if(head==null) return null;
		ListNode next = null;
		ListNode pre = null;
		while(head!=null) {
			//next保存head的下个节点
			next = head.next;
			//head的下一个节点始终指向pre
			head.next=pre;
			//pre指向当前head节点
			pre = head;
			//下一个节点循环
			head = next;
		}
		return pre;
    }
	
	/*
	 * 思路:利用栈的先进后出原则,先将链表压入栈中(正序)
	 * 全部压入后,再出栈赋值给链表,这样就实现了反转链表
	 * -----------------------------------------------
	 * 运行时间：39ms
	 * 占用内存：9280k
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
