package ��ָoffer;


/**
 * ����һ����������������е�����k����㡣
 * @author ilovejava1314
 */
public class �����е�����k�����14 {

	public static void main(String[] args) {
		
	}
	
	/*
	 * ˼·:�������head����ĳ��ȣ���ͨ���ó��ȼ�ȥ������k�
	 * �����Ϊ��������һ��
	 * ------------------------
	  * ����ʱ�䣺20ms
	  * ռ���ڴ棺9684k
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
	 * ˼·:������������ֱ�ָ��head��
	 * ��һ������ͷָ���k��
	 * ��ʱ�ڶ���������ָ��head��һ��
	 * ��ͬʱ�ƶ�����������ָ�룬
	 * ------------------------
	 * ����ʱ�䣺37ms
	 * ռ���ڴ棺9841k
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
