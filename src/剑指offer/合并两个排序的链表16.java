package ��ָoffer;

/**
 * ���������������������������������ϳɺ������
 * ��Ȼ������Ҫ�ϳɺ���������㵥����������
 * @author ilovejava1314
 */
public class �ϲ��������������16 {

	public static void main(String[] args) {
		
	}
	
	/*
	 * ˼·:�ݹ�˼��,�����ж��������Ƿ��п�����������ֱ�ӷ�����һ��
	 * �ж����������һ��Ԫ�ش�С����List1С��List1�ĵ�һ��Ԫ�ش���
	 * �������У��ݹ�List1.next��List2,��֮��Ȼ��
	 * -----------------------------------------------
	 * ����ʱ�䣺25ms
	 * ռ���ڴ棺9428k
	 */
	public static ListNode Merge(ListNode list1,ListNode list2) {
		if(list1==null) {
			return list2;
		}
		if(list2==null) {
			return list1;
		}
		ListNode pre = null;
		if(list1.val>list2.val) {
			pre=list2;
			pre.next=Merge(list1, list2.next);
		}else {
			pre=list1;
			pre.next=Merge(list1.next, list2);
		}
		return pre;
    }

}
