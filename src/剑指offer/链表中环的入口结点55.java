package ��ָoffer;

import java.util.ArrayList;

/**
 * ��һ�����������а����������ҳ�������Ļ�����ڽ�㣬�������null��
 * @author ilovejava1314
 */
public class �����л�����ڽ��55 {
	/*
	 * ˼·:
	 * 	����ArrayList�洢�����е�Ԫ�أ���ͷ��������
	 * ���ArrayList���Ѱ����˵�ǰ����Ԫ�أ���ֱ�ӷ��ص�ǰ
	 * Ԫ�أ�����Ԫ�ؼ�������ArrayList�С�
	 * -----------------------------------------------
	 * ����ʱ�䣺24ms
	 * ռ���ڴ棺9560k
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
	 * ˼·:
	 * 	��������ָ�룬һ����һ�������ҵ����߽��㡣
	 *  �ٽ���һ��ָ���ͷ��ʼ����һ��λ�ò��俪ʼ
	 *  Ѱ�һ���ڣ����ʱҲ���ҵ��˻����
	 * -----------------------------------------------
	 * ����ʱ�䣺19ms
	 * ռ���ڴ棺9252k
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
