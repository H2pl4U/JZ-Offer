package 剑指offer;


/**
 * 输入一个链表，输出该链表中倒数第k个结点。
 * @author ilovejava1314
 */
public class 链表中倒数第k个结点14 {

	public static void main(String[] args) {
		
	}
	
	/*
	 * 思路:首先求出head链表的长度，再通过用长度减去倒数第k项，
	 * 结果就为正数的那一项
	 * ------------------------
	  * 运行时间：20ms
	  * 占用内存：9684k
	 */
	public static ListNode FindKthToTail(ListNode head,int k) {
		if(head==null||k<=0) return null;
		int length = 0;
		ListNode currenListNode =head;
		while(currenListNode!=null) {
			length++;
			currenListNode=currenListNode.next;
		}
		int i=1;
		ListNode res = head;
		if(k>length) return null;
		while(i<=length-k) {
			if(res.next!=null) {
				res=res.next;
				i++;
			}else {
				return null;
			}
		}
		return res;
    }
	
	/*
	 * 思路:创建两个链表分别指向head，
	 * 第一个链表头指向第k项
	 * 此时第二个链表还是指向head第一项
	 * 再同时移动这两个链表指针，
	 * ------------------------
	 * 运行时间：37ms
	 * 占用内存：9841k
	 */
	public static ListNode FindKthToTail2(ListNode head,int k) {
		if(head==null||k<=0) return null;
		ListNode pre = head;
		ListNode last = head;
		for(int i=1;i<k;i++) {
			if(pre.next!=null) {
				pre=pre.next;
			}else {
				return null;
			}
		}
		while(pre.next!=null) {
			pre=pre.next;
			last=last.next;
		}
		return last;
	}
}
