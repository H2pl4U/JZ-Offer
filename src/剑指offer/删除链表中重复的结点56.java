package ��ָoffer;

/**
  * ��һ������������У������ظ��Ľ�㣬��ɾ��������
  * ���ظ��Ľ�㣬�ظ��Ľ�㲻��������������ͷָ�롣 
  * ���磬����1->2->3->3->4->4->5 �����Ϊ 1->2->5
 * @author ilovejava1314
 */
public class ɾ���������ظ��Ľ��56 {
	/*
	 * ˼·:
	 * 	�ݹ���⣬����ȷ������,��pHeadΪ�ջ���ֻ��һ��
	 * Ԫ��ʱ�򷵻ر���ͨ���Ƚϵ�ǰ��ֵ����next��ֵ��
	 * ɾ���ظ�Ԫ�أ�������ֲ���ͬԪ�صݹ���nextԪ�ء�
	 * -------------------------------------------
	 * ����ʱ�䣺22ms
	 * ռ���ڴ棺9564k
	 */
	public ListNode deleteDuplication(ListNode pHead)
    {
        if(pHead==null||pHead.next==null) return pHead; 
        if(pHead.val==pHead.next.val) {
        	ListNode next = pHead.next;
        	while(next!=null && pHead.val==next.val) {
        		next = next.next;
        	}
        	return deleteDuplication(next);
        }else {
        	pHead.next=deleteDuplication(pHead.next);
        	return pHead;
        }
    }

}
