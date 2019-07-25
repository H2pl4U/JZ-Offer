package 剑指offer;

import java.util.ArrayList;

/**
 * 给一个链表，若其中包含环，请找出该链表的环的入口结点，否则，输出null。
 * @author ilovejava1314
 */
public class 链表中环的入口结点55 {
	/*
	 * 思路:
	 * 	利用ArrayList存储链表中的元素，从头遍历链表
	 * 如果ArrayList中已包含了当前链表元素，则直接返回当前
	 * 元素，否则将元素继续存入ArrayList中。
	 * -----------------------------------------------
	 * 运行时间：24ms
	 * 占用内存：9560k
	 */
	public ListNode EntryNodeOfLoop(ListNode pHead){
		if(pHead==null||pHead.next==null) return null;
		ListNode p=pHead;
		ArrayList<Object> list = new ArrayList<Object>();
		while(p.next!=null) {
			if(list.contains(p.val)) {
				return p;
			}
			list.add(p.val);
			p=p.next;
		}
		return null;
    }
	
	/*
	 * 思路:
	 * 	利用两个指针，一个快一个慢，找到两者交点。
	 *  再将让一个指针从头开始，另一个位置不变开始
	 *  寻找环入口，相等时也就找到了环入口
	 * -----------------------------------------------
	 * 运行时间：19ms
	 * 占用内存：9252k
	 */
	public ListNode EntryNodeOfLoop2(ListNode pHead){
		if(pHead==null||pHead.next==null) return null;
		ListNode p1=pHead;
		ListNode p2=pHead;
		while(p1!=null&&p1.next!=null) {
			p1=p1.next.next;
			p2=p2.next;
			if(p2==p1) {
				p1=pHead;
				while(p1!=p2) {
					p1=p1.next;
					p2=p2.next;
				}
				return p1;
			}
		}
		return null;
	}
	
	
}
