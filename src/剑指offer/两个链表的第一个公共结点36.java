package ��ָoffer;


/**
 * �������������ҳ����ǵĵ�һ��������㡣
 * 
 * ����֪ʶ�㣺 ����
 * -------------------------------------------- 
 * @author ilovejava1314
 */
public class ��������ĵ�һ���������35 {

	/*
	 * ˼·:
	 * 		������������p1,p2�ֱ�ָ��pHead1��pHead2,��ͷ
	 * �ڵ㿪ʼ����Ѱ���Ƿ�Ϊ�����ڵ㣬�����Ǹ���ָ������һ
	 * ���ڵ㣬����˴νڵ�Ϊ�գ���ô��ͷ�ڵ���������������
	 * ָ�뵽�� null ���ߵ��﹫����㡣
	 * 
	 * ţ������selfboot
	 * ---------------------------------------------
	 * ����ʱ�䣺31ms
	 * ռ���ڴ棺9616k
	 */
	public ListNode FindFirstCommonNode(ListNode pHead1, ListNode pHead2) {
		ListNode p1 = pHead1;
		ListNode p2 = pHead2;
		while(p1!=p2) {
			p1=(p1==null?pHead1:p1.next);
			p2=(p2==null?pHead2:p2.next);
		}
		return p1;
    }

}
